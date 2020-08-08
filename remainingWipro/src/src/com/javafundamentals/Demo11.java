package src.com.javafundamentals;

public class Demo11 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 4, 1, 2, 4 };
		System.out.println(only14(arr));

	}

	public static boolean only14(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 1 && arr[i] != 4)
				return false;
		return true;
	}

}
