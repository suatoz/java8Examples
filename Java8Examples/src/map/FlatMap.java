package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import dataclasses.Student;

public class FlatMap {
	public static void main(String[] args) {
		stringArray();
		System.err.println("\n<------------------------------NEW METHOD------------------------------>");
		setExample();
		System.err.println("<------------------------------NEW METHOD------------------------------>");
		primitiveTypeEx();
	}
	
	private static void stringArray() {
		String[][] data = new String[][] {{"a","b"},{"c","d"},{"e","f"},{"g","h"}};
		
		Stream<String[]> temp = Arrays.stream(data);
		Stream<String> stringStream = temp.flatMap(x->Arrays.stream(x));
		Stream<String> stream = stringStream.filter(x-> !"a".equals(x.toString()));
		
		stream.forEach(System.out::print);
	}
	
	private static void setExample() {
		Student obj1 = new Student();
		obj1.setName("mkyong");
		obj1.addBook("Java 8");
		obj1.addBook("Java 9");
		obj1.addBook("Effective Java");
		
		Student obj2 = new Student();
		obj2.setName("Mahmut");
		obj2.addBook("Java 8");
		obj2.addBook("Linux");
		obj2.addBook("Pardus");
		
		List<Student> stdList = new ArrayList<>();
		stdList.add(obj1);
		stdList.add(obj2);
		
		List<String> collect = stdList.stream().map(x -> x.getBook()).flatMap(x->x.stream()).distinct().collect(Collectors.toList());
		
		collect.forEach(x-> System.out.println(x));
	}
	
	private static void primitiveTypeEx() {
		int[] intarr = {1,2,3,4,5,6,7,8,9};
		
		Stream<int[]> streamArray = Stream.of(intarr);
		IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
		
		intStream.forEach(System.out::println);
	}
}
