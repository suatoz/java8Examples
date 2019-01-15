package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMap {
	public static Map<Integer, String> hosting = new HashMap<>();
	static {
		hosting.put(1, "linode.com");
		hosting.put(2, "heroku.com");
		hosting.put(3, "digitalocean.com");
		hosting.put(4, "aws.amazon.com");
	}
	
	public static void main(String[] args) {
		filterMapReturnString();
		filterMapReturnMap();
		predicate();
	}

	private static void filterMapReturnString() {
		String result = hosting.entrySet().stream().filter(map-> "linode.com".equals(map.getValue())).map(map -> map.getValue()).collect(Collectors.joining());
		System.out.println(result);
		
		result = hosting.entrySet().stream().filter(x->{
			if(!x.getValue().contains("amazon") && !x.getValue().contains("digital"))
				return true;
			return false;
		}).map(map->map.getValue()).collect(Collectors.joining(","));
		
		System.out.println("<-------------------------------------->");
		System.out.println(result);
	}
	
	private static void filterMapReturnMap() {
		Map<Integer,String> collect = hosting.entrySet().stream().filter(map -> map.getKey() == 2).collect(Collectors.toMap(p->p.getKey(), p -> p.getValue()));
		print(collect);
		Map<Integer, String> collect2 = hosting.entrySet().stream().filter(map -> map.getKey() <=3).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		print(collect2);
	}
	
	public static <K,V> Map<K,V> filterbyValue(Map<K, V> map, Predicate<V> predicate){
		return map.entrySet().stream().filter(x->predicate.test(x.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	
	private static void predicate() {
		System.out.println("<------------------PREDICATE------------------->");
		Map<Integer, String> filteredMap = filterbyValue(hosting, x->x.contains("linode"));
		filteredMap.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
		System.out.println("<------------------PREDICATE------------------->");
		Map<Integer, String> filteredMap1 = filterbyValue(hosting, x->(x.length() <= 10));
		filteredMap1.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
	}
	
	private static void print(Map map) {
		System.out.println("<------------------MAP------------------->");
		map.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
		System.out.println("<------------------MAP------------------->");
	}

}
