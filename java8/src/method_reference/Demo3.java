package method_reference;

@FunctionalInterface
interface funcInterface {

	void process(int n);

}

public class Demo3 {

	public Demo3(int x) {

		if (prime(x))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

	public static void main(String[] args) {

		funcInterface fi = Demo3::new;
		fi.process(11);

	}

	static boolean prime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
