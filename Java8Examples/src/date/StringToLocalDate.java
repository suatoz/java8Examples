package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class StringToLocalDate {
	public static void main(String[] args) {
		ex1("2016-08-16");
		ex2("16-Aug-2016");
		ex3("16/08/2016");
		ex4("Salý, Haz 16 2016");
		ex5();
	}

	private static void ex1(String date) {
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("<--------------------EX1------------------------------>");
		System.out.println(localDate);
	}
	
	private static void ex2(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy",Locale.ENGLISH);
		LocalDate localDate = LocalDate.parse(date,formatter);
		System.out.println("<--------------------EX2------------------------------>");
		System.out.println(localDate);
		System.out.println(formatter.format(localDate));
	}
	
	private static void ex3(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy",Locale.ENGLISH);
		LocalDate localDate = LocalDate.parse(date,formatter);
		System.out.println("<--------------------EX3------------------------------>");
		System.out.println(localDate);
		System.out.println(formatter.format(localDate));
	}
	
	private static void ex4(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM d yyyy",new Locale("tr", "TR"));
		LocalDate localDate = LocalDate.parse(date,formatter);
		System.out.println("<--------------------EX4------------------------------>");
		System.out.println(localDate);
		System.out.println(formatter.format(localDate));
	}
	
	private static void ex5() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("EEEE, MMM d, yyyy HH:mm:ss a",Locale.ENGLISH);
        String date = "Tuesday, Aug 16, 2016 12:10:56 PM";

        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        System.out.println("<--------------------EX5------------------------------>");
        System.out.println(localDateTime);
        System.out.println(formatter.format(localDateTime));
	}
}
