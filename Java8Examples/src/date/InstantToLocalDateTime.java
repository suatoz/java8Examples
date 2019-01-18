package date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

public class InstantToLocalDateTime {
	public static void main(String[] args) {
		instantToLocalDate();
		System.out.println("<------------------------------Instant------------------------------>");
		localDateTimeToInstant();
	}

	private static void instantToLocalDate() {
		Instant instant = Instant.now();
		System.out.println("Instant : " + instant);
		LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

		System.out.println("LocalDateTime : " + ldt);
	}
	
	private static void localDateTimeToInstant() {
		LocalDateTime dateTime = LocalDateTime.of(2016, Month.APRIL, 18,6,17,10);
		
		System.out.println("LocalDateTime : " + dateTime);
		
		Instant instant = dateTime.toInstant(ZoneOffset.UTC);
		System.out.println("Instant : " + instant);
	}
}
