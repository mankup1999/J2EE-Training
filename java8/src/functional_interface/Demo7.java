package functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Demo7 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Consumer<Integer> c = i -> System.out.println(i + (i % 2 == 0 ? " even" : " odd"));

		list1.forEach(c);

	}

}
