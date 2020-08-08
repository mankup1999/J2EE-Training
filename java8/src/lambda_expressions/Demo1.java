package lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();

		Random rand = new Random();

		for (int i = 0; i < 25; i++)
			al.add(rand.nextInt(100));

		al.forEach(n -> {
			if (isPrime(n))
				System.out.println(n);
		});

	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
