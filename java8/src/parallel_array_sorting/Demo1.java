package parallel_array_sorting;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 92, 3, 84, 5, 64, 7, 81, 90, 10 };
		Arrays.parallelSort(arr);

		System.out.println(arr[0] + arr[arr.length - 1]);
	}

}