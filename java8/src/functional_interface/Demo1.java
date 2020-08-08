package functional_interface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<Employee> list1 = new ArrayList<Employee>();

		list1.add(new Employee(1, "RJ Khanna", "Mumbai", 35000));
		list1.add(new Employee(2, "Aleska Kamran", "Delhi", 100000));
		list1.add(new Employee(3, "Mahavir Sharma", "Noida", 36000));
		list1.add(new Employee(4, "Jairam Singh", "Patna", 78000));
		list1.add(new Employee(5, "Manoj Pandey", "Banglore", 58000));

		Function<Employee, String> f = e -> e.getLocation();

		ArrayList<String> list2 = (ArrayList<String>) list1.stream().map(f).collect(Collectors.toList());

		list2.forEach(System.out::println);

	}

}
