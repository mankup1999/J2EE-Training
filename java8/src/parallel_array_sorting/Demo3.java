package parallel_array_sorting;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 92, 3, 84, 5, 64, 7, 81, 90, 10 };
		Arrays.parallelSort(arr, 0, 5);

		Arrays.stream(arr, 0, 5).forEach(System.out::println);

	}

}
