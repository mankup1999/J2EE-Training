package src.com.javafundamentals;

public class Demo13 {

	public static void main(String[] args) {

		if (args.length != 4) {
			System.out.println("Please enter 4 integer numbers");
			return;
		}

		int[][] res = new int[2][2];

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				res[i][j] = Integer.parseInt(args[2 * i + j]);

		System.out.println("The given array is : ");
		show(res);

		int[][] rev = reverse(res);

		System.out.println("The reverse of array is : ");
		show(rev);

	}

	public static void show(int[][] a) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] reverse(int[][] a) {
		int[][] res = new int[2][2];
		for (int i = 1; i >= 0; i--) {
			for (int j = 1; j >= 0; j--) {
				res[1-i][1 - j] = a[i][j];
			}
		}

		return res;
	}

}
