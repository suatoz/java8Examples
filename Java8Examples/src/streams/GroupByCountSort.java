package streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByCountSort {
	public static List<String> items = new ArrayList<String>();
	static {
		items.add("apple");
		items.add("apple");
		items.add("apple");
		items.add("banana");
		items.add("banana");
		items.add("orance");
		items.add("papaya");
		items.add("pinapple");
	}
	
	public static void main(String[] args) {
		countEx();
		System.out.println("<------------------------------------------->");
		sorting();
	}
	
	private static void countEx() {
		Map<String,Long> result = items.stream().collect(Collectors.groupingBy(
				Function.identity(),Collectors.counting()));
		
		result.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
	}
	
	private static void sorting() {
		Map<String, Long> result = items.stream().collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting())
				);
		
		Map<String, Long> finalMap = new LinkedHashMap<>();
		
		result.entrySet().stream().sorted(
				Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e->finalMap.put(e.getKey(), e.getValue()));
		
		finalMap.forEach((k,v)->{
			System.out.println(k + " " + v);
		});
	}
}
