package streams;

import java.util.List;
import java.util.stream.Collectors;

import dataclasses.Staff;

public class ListOfObject {
	public static void main(String[] args) {
		List<Staff> staffs = Staff.getStaffs();
		List<String> names = staffs.stream().map(m->m.getName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	} 

}
