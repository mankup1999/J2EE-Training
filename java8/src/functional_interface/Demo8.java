package functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Demo8 {

	public static void main(String[] args) {

		Supplier<List<Integer>> s = () -> {
			int count = 0;
			int i = 2;
			ArrayList<Integer> list = new ArrayList<>();
			while (true) {
				if (prime(i)) {
					count++;
					list.add(i);
				}
				if (count == 10)
					break;
				i++;
			}
			return list;
		};

		s.get().forEach(System.out::println);;

	}

	public static boolean prime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
