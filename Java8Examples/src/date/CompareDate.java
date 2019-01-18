package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * 
Letter	Description	Examples
y	Year	2013
M	Month in year	July, 07, 7
d	Day in month	1-31
E	Day name in week	Friday, Sunday
a	Am/pm marker	AM, PM
H	Hour in day	0-23
h	Hour in am/pm	1-12
m	Minute in hour	0-60
s	Second in minute	0-60
 * 
 * */

public class CompareDate {
	public static void main(String[] args) {
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1 = LocalDate.of(2009, 12, 31);
		LocalDate date2 = LocalDate.of(2010, 01, 31);

		System.out.println("date1 : " + sdf.format(date1));
		System.out.println("date2 : " + sdf.format(date2));

		if(date1.isAfter(date2))
			System.out.println("date1 after date2");

		if(date1.isBefore(date2))
			System.out.println("date1 is before date2");

		if(date1.isEqual(date2))
			System.out.println("date1 equel date2");

		System.out.println(date1.compareTo(date2)); //-1 before, 1 after, 0 equel
	}	
}
