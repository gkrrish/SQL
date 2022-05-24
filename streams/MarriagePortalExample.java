package com.example.streams;

import java.util.Arrays;
import java.util.List;

public class MarriagePortalExample {
	public static void main(String[] args) {
		Person p1 = new Person("Raju", "Software", 8765467890987L);
		Person p2 = new Person("Gopi", "Chef", 754678907890L);
		Person p3 = new Person("Mahesh", "Photographer", 34567890765L);
		Person p4 = new Person("Sunil", "Driver", 879686865789L);
		Person p5 = new Person("David", "Teacher", 454555555L);
		Person p6 = new Person("Ashok", "Software", 87654687690987L);

		// Give me Person name with number who is working as software

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6);

		personList.stream().filter(p -> p.getJob().equalsIgnoreCase("Software"))
						   .map(p->p.getName()+" "+p.getPhoneNumber())
						   .forEach(System.out::println);

	}

}
