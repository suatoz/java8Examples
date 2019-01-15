package stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import dataclasses.StaffPublic;

public class StringJoinerEx {
	public static void main(String[] args) {
		generalEx();
		stringJoin();
		collectorsJoining();
		collectorsObject();
	}
	
	private static void generalEx() {
		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result = sj.toString();
		System.out.println(result);
		
		StringJoiner sj2 = new StringJoiner("/","prefix-","-suffix");
		sj2.add("2016");
		sj2.add("02");
		sj2.add("26");
		String result2 = sj2.toString();
		System.out.println(result2);
	}
	
	private static void stringJoin() {
		String result = String.join("-", "2015","10","31");
		System.out.println(result);
		
		List<String> list = Arrays.asList("java","python","nodejs","ruby","apache","tomcat");
		String  result2 = String.join(", ", list);
		System.out.println(result2);
	}
	
	private static void collectorsJoining() {
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		String result = list.stream().map(x->x).collect(Collectors.joining(" | "));
		System.out.println(result);
	}
	
	private static void collectorsObject() {
		List<StaffPublic> list = Arrays.asList(new StaffPublic("Ahmet", 5, ""),new StaffPublic("Mehmet",10,""),new StaffPublic("Mahmut", 10, ""));
		String result = list.stream().map(x->x.getName()).collect(Collectors.joining(", ", "{", "}"));
		System.out.println(result);
	}
}
