package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import dataclasses.Staff;

public class MapEx {
	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a","b","c","d");
		List<Integer> beta = Arrays.asList(1,2,3,4,5);
		
		toUpperCaseLambda(alpha, beta);
		System.out.println("-------------------Staff------------------");
		mapExForClassType(Staff.getStaffs());
	}
	
	private static void toUpperCaseLambda(List<String> alpha,List<Integer> beta) {
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("-------------------Extra------------------");
		List<Integer> integerMap = beta.stream().map(n->n*2).collect(Collectors.toList());
		integerMap.forEach(System.out::println);
		
	}
	
	private static void mapExForClassType(List<Staff> staffList) {
		List<String> getNames = staffList.stream().map(m->m.getName()).collect(Collectors.toList());
		getNames.forEach(System.out::println);
	}
}
