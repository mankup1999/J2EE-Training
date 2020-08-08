package functional_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo6 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("malayalam");
		list1.add("maam");
		list1.add("Kumkum");
		list1.add("Siyachin");
		list1.add("inni");
		list1.add("surya");
		list1.add("yes");
		list1.add("Correct");
		list1.add("seeta");
		list1.add("ok");

		Consumer<String> c = s -> System.out.println(reverse(s));

		list1.forEach(c);
	}

	public static String reverse(String s) {
		String res = "";
		int n = s.length();
		for (int i = n - 1; i >= 0; i--)
			res += s.charAt(i);
		return res;
	}

}
