package date_time_api;

import java.time.LocalDate;

public class Demo4 {

	public static void main(String[] args) {

		long year = LocalDate.now().getYear();

		if (year % 100 == 0) {
			if (year % 400 == 0)
				System.out.println("Leap year");
			else
				System.out.println("Not a leap year");
		} else if (year % 4 == 0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");

	}

}
