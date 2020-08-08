package interfaces;

public class Demo2 {

	public static void main(String[] args) {

		Test t1 = (a, b, c) -> (a + b + c);
		Test t2 = (a, b, c) -> (a * b * c);

		System.out.println(t1.myfunction(2, 3, 4));
		System.out.println(t2.myfunction(2, 3, 4));

	}

}
