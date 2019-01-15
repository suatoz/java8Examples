package sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByKeys {
	public static Map<String, Integer> unSortMap = new HashMap<String, Integer>();
	static {
		unSortMap.put("z", 10);
		unSortMap.put("b", 5);
		unSortMap.put("a", 6);
		unSortMap.put("c", 20);
		unSortMap.put("d", 1);
		unSortMap.put("e", 7);
		unSortMap.put("y", 8);
		unSortMap.put("n", 99);
		unSortMap.put("g", 50);
		unSortMap.put("m", 2);
		unSortMap.put("f", 9);
	}
	
	public static void main(String[] args) {
		print(unSortMap);
		
		Map<String, Integer> sortedMapByKey = unSortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldVal,newVal)->oldVal,LinkedHashMap::new)
				);
		print(sortedMapByKey);
		
		Map<String, Integer> sortedByValue = unSortMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldVal,newVal)->oldVal,LinkedHashMap::new)
				);
		print(sortedByValue);
	}
	
	private static void print(Map<String, Integer> map) {
		map.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
		System.out.println("<------------------------------------>");
	}

}
