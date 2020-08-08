package date_time_api;

import java.time.LocalDate;

public class Demo1 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println(date);
		
		System.out.println(date.plusDays(10));

	}

}
