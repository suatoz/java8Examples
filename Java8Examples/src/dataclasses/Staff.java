package dataclasses;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Staff {
	private String name;
	private int age;
	private BigDecimal salary;	
	
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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Staff(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public static List<Staff> getStaffs() {
		List<Staff> staffList = Arrays.asList(
				new Staff("Zeynep", 30, new BigDecimal(8000)),
				new Staff("Ayþe", 20, new BigDecimal(3500)),
				new Staff("Gülizar", 25, new BigDecimal(5500))
				);
		
		return staffList;
	}
}
