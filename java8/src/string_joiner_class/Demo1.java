package string_joiner_class;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Manku");
		names.add("Rajesh");
		names.add("SR Ravi");
		names.add("Manav Sharma");
		names.add("Mukesh Rishi");
		names.add("Azaz Khan");

		StringJoiner sj = new StringJoiner(",", "{", "}");

		names.forEach(e -> sj.add(e));

		System.out.println(sj);
	}

}
