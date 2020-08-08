package for_each;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		al.add("Monday");
		al.add("Tuesday");

		al.forEach(s -> {
			System.out.println(s);
		});

	}

}
