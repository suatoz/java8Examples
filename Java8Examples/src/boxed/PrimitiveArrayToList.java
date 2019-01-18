package boxed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitiveArrayToList {
	public static void main(String[] args) {
		int[] number = {1,2,3,3,4,5,6,9,7,};
		
		List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
		System.out.println(list);
	}
}
