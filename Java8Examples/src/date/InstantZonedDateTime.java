package date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantZonedDateTime {
	public static void main(String[] args) {
		instantToZonedDateTime();
	}
	
	private static void instantToZonedDateTime() {
		Instant instant = Instant.now();
		System.out.println("Instant : " + instant);
		
		ZonedDateTime jptime = instant.atZone(ZoneId.of("Asia/Tokyo"));
		
		System.out.println("ZonedDateTime : " + jptime);
		System.out.println("offset : " + jptime.getOffset());
	}
}
