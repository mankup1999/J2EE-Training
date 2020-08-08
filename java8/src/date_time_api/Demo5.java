package date_time_api;

import java.time.LocalTime;

public class Demo5 {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println(time);
		
		System.out.println(time.plusMinutes(25));

	}

}
