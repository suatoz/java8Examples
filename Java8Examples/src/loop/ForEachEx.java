package loop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ForEachEx {
	public static void main(String[] args) {
		mapExample();
		System.out.println("--------------List---------------");
		listExample();
	}

	private static void mapExample() {
		Map<String,Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.put("G", 70);

		items.forEach((k,v)->System.out.println("Item :" + k + " Count: " + v));
		
		System.out.println("---------------------------------");

		items.forEach((k,v)->{
			System.out.println("Item :" + k + " Count: " + v);
			if("E".equalsIgnoreCase(k))
				System.out.println("Hello EEEEE");
		});
	}
	
	private static void listExample() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		
		list.forEach((item)->System.out.println(item));
		System.out.println("---------------------------------");
		list.forEach((item)->{
			if("C".equalsIgnoreCase(item))
				System.out.println(item);
		});
		System.out.println("---------------------------------");
		list.forEach(System.out::println);
		System.out.println("---------------------------------");
		list.stream().filter(s->s.contains("B")).forEach(System.out::println);		
	}

}
