package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(-5, -4, -3, -2, -1, 1, 2, 3, 4);

		Stream<Integer> s = l.stream().filter(i -> (i < 0 && i % 2 == 0));

		List<Integer> l1 = s.collect(Collectors.toList());
		
		l1.forEach(System.out::println);

	}

}
