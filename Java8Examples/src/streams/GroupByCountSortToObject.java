package streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import dataclasses.Item;

public class GroupByCountSortToObject {
	public static void main(String[] args) {
		List<Item> items = Item.getItems();

		Map<String, Long> counting = items.stream().collect(
				Collectors.groupingBy(Item::getName,Collectors.counting())
				);
		printFunc(counting);
		
		Map<String, Integer> sum = items.stream().collect(
				Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty))
				);		
		printFunc(sum);
		
		Map<BigDecimal, List<Item>> groupByPriceMap = items.stream().collect(Collectors.groupingBy(Item::getPrice));
		printFunc(groupByPriceMap);
		
		Map<BigDecimal, Set<String>> result = items.stream().collect(
				Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName, Collectors.toSet()))
				);		
		printFunc(result);
	}

	private static void printFunc(Map list) {
		list.forEach((k,v)->{
			System.out.println(k + " " + v);
		});

		System.out.println("<------------------------------------>");
	}
}
