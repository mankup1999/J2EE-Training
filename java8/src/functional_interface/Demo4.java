package functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo4 {

	public static void main(String[] args) {

		ArrayList<Employee> list1 = new ArrayList<Employee>();

		list1.add(new Employee(1, "RJ Khanna", "Mumbai", 5000));
		list1.add(new Employee(2, "Aleska Kamran", "Delhi", 100000));
		list1.add(new Employee(3, "Mahavir Sharma", "Noida", 36000));
		list1.add(new Employee(4, "Jairam Singh", "Patna", 78000));
		list1.add(new Employee(5, "Manoj Pandey", "Banglore", 8000));

		Predicate<Employee> p = e -> (e.getSalary() < 10000);

		list1.stream().filter(p).forEach(System.out::println);

	}

}
