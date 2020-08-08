package date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Demo2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now().plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

		System.out.println(date);

	}

}
