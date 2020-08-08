package for_each;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId(i);
			emp.setName("name" + i);
			emp.setAddress("address" + i);
			emp.setSalary(i * 10000);
			empList.add(emp);
		}

		empList.forEach(e -> {
			System.out.println(e);
		});

	}

}
