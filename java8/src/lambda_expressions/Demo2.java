package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		for (int i = 0; i < 10; i++)
			al.add("hello " + i);

		al.forEach(s -> {
			System.out.println(reverse(s));
		});

	}

	static String reverse(String s) {
		String res = "";
		int n = s.length();
		for (int i = n-1; i >= 0; i--)
			res += s.charAt(i);
		return res;
	}

}
