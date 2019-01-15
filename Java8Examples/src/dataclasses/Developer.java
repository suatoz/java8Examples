package dataclasses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Developer {
	private BigDecimal salary = BigDecimal.ZERO;
	private String name = "";
	private int age = 0;
	
	
	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

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

	public Developer(BigDecimal salary, String name, int age) {
		this.salary = salary;
		this.name = name;
		this.age = age;
	}
	
	public static List<Developer> getDevelopers(){
		List<Developer> result = new ArrayList<>();
		
		result.add(new Developer(new BigDecimal("10000"), "Mehmet", 33));
		result.add(new Developer(new BigDecimal("12000"), "Ali", 20));
		result.add(new Developer(new BigDecimal("5000"), "Mahmut", 12));
		result.add(new Developer(new BigDecimal("7500"), "Veli", 50));
		
		return result;
	}

}
