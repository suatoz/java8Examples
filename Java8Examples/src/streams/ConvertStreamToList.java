package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToList {
	public static void main(String[] args) {
		String[] array = {"java", "python", "node"};
		Supplier<Stream<String>> supplier = () -> Stream.of(array);
		//Another create stream from arrays
		Supplier<Stream<String>> supplier1 = () -> Arrays.stream(array);

        //Convert a Stream to List
        List<String> result = supplier.get().collect(Collectors.toList());
        result.forEach(System.out::println);
		System.out.println("<------------------------------------>");
		
		List<String> result1 = supplier.get().filter(c->!c.equalsIgnoreCase("node")).collect(Collectors.toList());
		result1.forEach(System.out::println);
		System.out.println("<------------------------------------>");
		
		supplier1.get().forEach(x -> System.err.println(x));
	}
}
