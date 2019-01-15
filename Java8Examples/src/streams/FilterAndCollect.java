package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {
	
	public static void main(String[] args) {
		filterEx();
	}
	
	private static void filterEx() {
		List<String> lines = Arrays.asList("spring","node","mkyong");
		
		List<String> result = lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
