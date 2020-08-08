package functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Function<Integer, Integer> f = i -> i;

		System.out.println(list1.stream().map(f).reduce(0, (a, b) -> a + b));

	}

}
