package string_joiner_class;

import java.util.StringJoiner;

public class Demo2 {

	public static void main(String[] args) {

		StringJoiner s1 = new StringJoiner("-");

		s1.add("Mumbai");
		s1.add("Delhi");
		s1.add("Banglore");
		s1.add("Kolkata");

		StringJoiner s2 = new StringJoiner("-");

		s1.add("Goa");
		s1.add("Gujarat");
		s1.add("Patna");
		s1.add("Banaras");

		System.out.println(s1.merge(s2));

		System.out.println(s2.merge(s1));

	}

}
