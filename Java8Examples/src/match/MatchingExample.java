package match;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MatchingExample {
	static String[] alphabet = new String[]{"A","B","C","D"};
	static int[] number = {1,2,3,4,5,6,7,8,9,10};
	static long[] numberLong = {1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		matchingEx();
		matchingEx2();
	}
	
	private static void matchingEx() {
		boolean result = Arrays.stream(alphabet).anyMatch(c->c.equals("A") || c.equals("B")); //("A"::equals);
		if(result)
			System.out.println("A or B");
	}
	
	private static void matchingEx2() {
		boolean result = IntStream.of(number).anyMatch(x->x==9);
		
		if(result)
			System.out.println("IntStream -> 9");
		
		boolean result2 = LongStream.of(numberLong).anyMatch(x->x==1);
		
		if (result2)
			System.out.println("LongStream -> 1");
	}
}
