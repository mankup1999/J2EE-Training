package src.com.javafundamentals;

public class Demo12 {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 2, 3, 4 };

		int[] res = middleWay(a1, a2);

		for (int i = 0; i < res.length; i++)
			System.out.print(res[i] + " ");

	}

	public static int[] middleWay(int[] a1, int[] a2) {
		int[] arr = new int[2];
		arr[0] = a1[1];
		arr[1] = a2[1];
		return arr;
	}
}
