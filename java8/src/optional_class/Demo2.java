package optional_class;

import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		
		String s=null;
		Optional<String> opt=Optional.ofNullable(s);
		
		System.out.println(opt.orElse("India"));

	}

}
