package method_reference;

@FunctionalInterface
interface functionalInterface {

	int process(int n);

}

public class Demo1 {

	int factorial(int n) {
		if (n <= 1)
			return n;
		int res = 1;
		for (int i = 1; i <= n; i++)
			res *= i;
		return res;
	}

	public static void main(String[] args) {

		functionalInterface fi = new Demo1()::factorial;
		System.out.println(fi.process(6));

	}

}
