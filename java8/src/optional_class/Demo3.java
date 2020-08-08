package optional_class;

import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {

		Employee emp = null;
		Optional<Employee> opt = Optional.ofNullable(emp);

		System.out.println(opt.orElseThrow(() -> new InavalidEmployeeException()));

	}

}
