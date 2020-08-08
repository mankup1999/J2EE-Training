package date_time_api;

import java.time.LocalTime;

public class Demo6 {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println(time);

		System.out.println(time.minusHours(5).minusMinutes(30));

	}

}
