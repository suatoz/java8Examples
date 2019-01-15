package streams;

import java.util.List;
import java.util.stream.Collectors;

import dataclasses.Staff;
import dataclasses.StaffPublic;

public class ConvertOtherClassWithStream {
	public static void main(String[] args) {
		List<Staff> staffs = Staff.getStaffs();
		
		List<StaffPublic> result = staffs.stream().map(temp -> {
			StaffPublic obj = new StaffPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			if("Ayþe".equals(temp.getName()))
				obj.setExtra("this field is for mkyong only!");
			return obj;
		}).collect(Collectors.toList());
		
		result.forEach(m -> System.out.println(m.getName() + m.getAge() + m.getExtra()));
	}
}
