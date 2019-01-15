package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dataclasses.Developer;

public class ComparatorEx {


	public static void main(String[] args) {
		List<Developer> listHuman = Developer.getDevelopers();

		//first init
		printList(listHuman,"Before");		
		//OldSortMethod
		oldSorting(listHuman);		
		//Lambda
		sortWithLambdaExp(listHuman);
		//reverse sorting
		reverseSortingWithLambda(listHuman);
	}

	private static void oldSorting(List<Developer> list) {
		Collections.sort(list, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		printList(list,"After Old Method");
	}
	
	private static void sortWithLambdaExp(List<Developer> list) {
		list.sort((Developer o1,Developer o2)->o1.getSalary().compareTo(o2.getSalary()));
		printMethodLambda(list, "After New Lambda Method");
	}
	
	private static void reverseSortingWithLambda(List<Developer> list) {
		Comparator<Developer> nameComparator = (o1,o2)->o1.getName().compareTo(o2.getName());
		list.sort(nameComparator.reversed());
		printMethodLambda(list, "After reverse name sorting");
	}
	
	private static void printMethodLambda(List<Developer> list,String state) {
		System.out.println(state);
		list.forEach((dev)-> System.out.println(dev.getName() + " " + dev.getAge() + " " + dev.getSalary()));
	}
	
	private static void printList(List<Developer> list,String state) {
		System.out.println(state);
		for(Developer dev:list) {
			System.out.println(dev.getName() + " " + dev.getAge() + " " + dev.getSalary());
		}
	}
}
