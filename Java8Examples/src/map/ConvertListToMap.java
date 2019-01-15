package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import dataclasses.Hosting;

public class ConvertListToMap {
	public static List<Hosting> list = new ArrayList<Hosting>();
	static {
		list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));        
	}
	
	public static void main(String[] args) {
		listToMap();
		duplicatedKey();
		sortAndCollect();
	}
	
	public static void listToMap() {
		Map<Integer, String> resut1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		print(resut1);
		
		Map<String, Long> result2 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
		print(result2);
		
		Map<String, Integer> result3 = list.stream().collect(Collectors.toMap(x -> x.getName(), x -> x.getId()));
		print(result3);
	}
	
	public static void duplicatedKey() {
        list.add(new Hosting(6, "linode.com", 100000)); // new line
       
        //oldVal<>newVal deðiþebilir
        Map<String,Long> result1 = list.stream().collect(Collectors.toMap(Hosting::getName,Hosting::getWebsites, (oldVal,newVal)-> oldVal));
        print(result1);
	}
	
	public static void sortAndCollect() {
		Map result = list.stream().sorted(Comparator.comparingLong(Hosting::getWebsites).reversed()).collect(Collectors.toMap(
				Hosting::getName,Hosting::getWebsites,(oldVal,newVal) -> oldVal,LinkedHashMap::new
				));		
		print(result);
	}
	
	private static void print(Map list) {
		list.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
		System.out.println("<------------------------------------>");
	}
}
