package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();

		for (int i = 0; i < 10; i++)
			al.add("hello " + i*5);

		al.forEach(s -> {
			if ((s.length()) % 2 != 0)
				System.out.println(s);
		});

	}

}
