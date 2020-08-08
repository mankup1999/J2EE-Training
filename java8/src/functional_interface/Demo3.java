package functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo3 {

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

		Predicate<String> p = s -> palindrome(s);

		System.out.println(list1.stream().filter(p).collect(Collectors.toList()));

	}

	public static boolean palindrome(String s) {
		int n = s.length();
		String res = "";
		for (int i = n - 1; i >= 0; i--)
			res += s.charAt(i);
		return res.equals(s);
	}

}
