package GenRandomInt;

import java.util.Random;

public class RandomIntegers {
	public static void main(String[] args) {	
		for(int i=0;i<5;i++) {
		System.out.println(utilRandom(1, 5));
		System.out.println(mathRandom(1, 5));
		System.out.println(randomInts(1, 5) + "---------> JAVA8");
		randomGenerator();
		System.out.println("<------------------------------ENDLINE------------------------------>");
		}
	}

	private static int utilRandom(int min,int max) {
		if(min>max)
			throw new IllegalArgumentException("max grater then min");

		Random r = new Random();
		return r.nextInt((max-min) + 1)+min;
	}
	
	private static int mathRandom(int min,int max) {
		return (int)(Math.random()*((max-min)+1)) + min;
	}
	
	private static int randomInts(int min,int max) {
		Random r = new Random();
		return r.ints(min,(max+1)).findFirst().getAsInt();
	}
	
	private static void randomGenerator() {
		new Random().ints(10,1,9).forEach(System.out::println);;
	}
}
