package functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Demo5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Predicate<Integer> p = i -> process(i);
		
		list1.stream().filter(p).forEach(System.out::println);

	}

	public static boolean process(int x) {
		int r = (int) Math.sqrt(x);

		return r * r == x;
	}

}
