package method_reference;

@FunctionalInterface
interface functional_interface {
	int process(int n);
}

public class Demo2 {

	static int digitCount(int n) {
		int res = 0;
		while (n != 0) {
			n /= 10;
			res++;
		}
		return res;
	}

	public static void main(String[] args) {

		functionalInterface fi = Demo2::digitCount;
		System.out.println(fi.process(2456));

	}

}
