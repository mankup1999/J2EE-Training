package date_time_api;

import java.time.LocalDate;
import java.time.Period;

public class Demo3 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalDate start = LocalDate.of(2019, 5, 20);

		Period p = start.until(date);

		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());

	}

}
