package streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValue {
	public static void main(String[] args) {
		String[] array = {"java", "python", "node", null, "ruby", null, "php"};
		Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);
		
		List<String> result = streamSupplier.get().collect(Collectors.toList());
		result.forEach(System.out::println);
		System.out.println("<------------------------------------>");
		
		
		List<String> filterResult = streamSupplier.get().filter(x->x!=null).collect(Collectors.toList());
		filterResult.forEach(System.out::println);
		System.out.println("<------------------------------------>");
	}
}
