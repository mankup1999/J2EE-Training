package stream_api;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList<Student> list1 = new ArrayList<Student>();

		list1.add(new Student(1, "Mussu", 45));
		list1.add(new Student(2, "Muskan", 95));
		list1.add(new Student(3, "Rupendra", 62));
		list1.add(new Student(4, "Alen", 67));
		list1.add(new Student(5, "Aleska", 78));

		System.out.println(list1.stream().filter(i -> (i.getMark() >= 50)).count());

	}

}
