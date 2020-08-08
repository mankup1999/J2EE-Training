package optional_class;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		String[] names = new String[5];

		Optional<String> l = Optional.ofNullable(names[0]);

		if (l.isPresent())
			System.out.println(l.get());

	}

}
