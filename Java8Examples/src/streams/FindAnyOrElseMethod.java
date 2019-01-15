package streams;

import java.util.List;
import java.util.stream.Collectors;

import dataclasses.Person;

public class FindAnyOrElseMethod {
	public static void main(String[] args) {
		List<Person> persons = Person.getPersons();
		
		findAnySingleEx(persons);
		System.out.println("----------------------------------------------------");
		findAnyMultipleEx(persons);
		System.out.println("----------------------------------------------------");
		findAnyMapEx(persons);
	}

	private static void findAnySingleEx(List<Person> persons) {
		Person result1 = persons.stream().filter(x->"jack".equals(x.getName())).findAny().orElse(null);
		System.out.println(result1);
		
		Person result2 = persons.stream().filter(x->"Mehmet".equals(x.getName())).findAny().orElse(null);
		System.out.println(result2.getName() + " " + result2.getAge());
	}
	
	private static void findAnyMultipleEx(List<Person> persons) {
		Person result1 = persons.stream().filter(c-> "Veli".equals(c.getName()) && c.getAge() == 10).findAny().orElse(null);
		System.out.println(result1);
	}
	
	private static void findAnyMapEx(List<Person> persons) {
		String name = persons.stream().filter(x->x.getName().equalsIgnoreCase("Samet")).map(Person::getName).findAny().orElse("");
		System.out.println(name);
		System.out.println("-------------------Hepsi----------------------");
		List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
}
