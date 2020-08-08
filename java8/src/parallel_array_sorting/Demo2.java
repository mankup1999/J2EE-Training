package parallel_array_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char[] chars = s.toCharArray();

		Arrays.parallelSort(chars);

		String res = String.copyValueOf(chars);

		System.out.println(res);

		sc.close();

	}

}
