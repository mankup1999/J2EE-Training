package lambda_expressions;

public class MyClassWithLambda {

	public static void main(String[] args) {

		WordCount wc = (s) -> {
			int count = 1;
			int i = s.indexOf(' ');
			while (i != -1) {
				i = s.indexOf(' ', i + 1);
				count++;
			}
			return count;
		};

		int n = wc.count("Hello World! This is NewYork");

		System.out.println(n);

	}

}
