package dataclasses;

import java.util.Arrays;
import java.util.List;

public class Person {
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static List<Person> getPersons() {
		List<Person> persons = Arrays.asList(new Person("Mahmut", 30),new Person("Mehmet", 20),new Person("Samet", 50));
		return persons;
	}

}
