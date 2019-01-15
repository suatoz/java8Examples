package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MapToList {
	public static Map<Integer, String> map = new HashMap<>();
	static {
		map.put(10, "apple");
		map.put(20, "orange");
		map.put(30, "banana");
		map.put(40, "watermelon");
		map.put(50, "pinapple");
	}
	public static void main(String[] args) {
		mapToList1();
		mapToList2();
		mapToList3();
	}
	
	private static void maptoListGeneral() {
		Map<String, String> map = new HashMap<>();
		
		List<String> list = new ArrayList(map.keySet());
		List<String> list1 = new ArrayList(map.values());
		List<String> list2 = map.keySet().stream().collect(Collectors.toList());
		List<String> list3 = map.values().stream().collect(Collectors.toList());
		List<String> list4 = map.values().stream().filter(x -> x.equalsIgnoreCase("a")).collect(Collectors.toList());
	}
	
	private static void mapToList1() {		
		List<Integer> result = new ArrayList(map.keySet());
		List<String> result2 = new ArrayList(map.values());
		List<Integer> result3 = map.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.err.println("<------------------------------MapToList1------------------------------>");
		result.forEach(System.out::println);
		System.err.println("<------------------------------MapToList1------------------------------>");
		result2.forEach(System.out::println);
		System.err.println("<------------------------------MapToList1------------------------------>");
		result3.forEach(System.out::println);
	}
	
	private static void mapToList2() {
		List<Integer> result = map.keySet().stream().collect(Collectors.toList());
		System.err.println("<------------------------------MapToList2------------------------------>");
		result.forEach(System.out::println);
		List<String> sortedList = map.values().stream().filter(x->x.contains("na")).collect(Collectors.toList());
		System.err.println("<------------------------------MapToList2------------------------------>");
		sortedList.forEach(System.out::println);
	}
	
	private static void mapToList3() {
		List<Integer> resultSortedKey = new ArrayList<>();
		List<String> result = map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed()).peek(e -> resultSortedKey.add(e.getKey())).map(x->x.getValue()).filter(x->!x.equalsIgnoreCase("banana")).collect(Collectors.toList());		
		System.err.println("<------------------------------MapToList3------------------------------>");
		result.forEach(System.out::println);
		System.err.println("<------------------------------MapToList3------------------------------>");
		resultSortedKey.forEach(System.out::println);
	}
}
