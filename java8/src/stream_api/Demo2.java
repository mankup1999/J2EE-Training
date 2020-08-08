package stream_api;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Employee> list1 = new ArrayList<Employee>();

		list1.add(new Employee(1, "RS Ravi", 22, "Pune"));
		list1.add(new Employee(2, "Manavi Sharma", 21, "Mumbai"));
		list1.add(new Employee(3, "Shehnaz Alam", 31, "Delhi"));
		list1.add(new Employee(4, "Apporva Arora", 45, "Noida"));
		list1.add(new Employee(5, "Mukesh Rishi", 34, "Pune"));

		ArrayList<Employee> list2 = (ArrayList<Employee>) list1.stream()
				.filter(i -> i.getLocation().equalsIgnoreCase("Pune")).collect(Collectors.toList());

		list2.forEach(System.out::println);
	}

}
