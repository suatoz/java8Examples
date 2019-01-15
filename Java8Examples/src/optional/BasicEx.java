package optional;

import java.util.Optional;

public class BasicEx {
	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		String answ = "Yes";
		String answ2 = null;
		
		System.out.println("Non-Empty Op: " + gender);
		System.out.println("Non-Empty Op. Gender Val: " + gender.get());
		System.out.println("Empty Op " + Optional.empty());
		System.out.println("ofNullable " + Optional.ofNullable(answ));
		System.out.println("ofNullable " + Optional.ofNullable(answ2));
		
		System.out.println("NullPointerException " + Optional.of(answ));
	}
}
