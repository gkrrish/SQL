package com.example.streams;

import java.util.ArrayList;
import java.util.List;

public class MapFilertExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Anuska");
		list.add("Trisha");
		list.add("Nayanatara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Anupama Parameswaran");
		list.add("Amisha Patel");

		// Question : Display the name with length whose name starts with 'A'
		// Example : Amisha Patel 11
		// Example : Anupama Prameswaran 20

		list.stream().filter(names -> names.startsWith("A")).map(name -> name + " " + name.length())
				.forEach(System.out::println);

	}

	public void testMethod() {
		List<String> list = new ArrayList<>();
		list.add("Anuska");
		list.add("Trisha");
		list.add("Nayanatara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Anupama Parameswaran");
		list.add("Amisha Patel");

		// Question : Display the name with length whose name starts with 'A'
		// Example : Amisha Patel 11
		// Example : Anupama Prameswaran 20

		list.stream().filter(names -> names.startsWith("A")).map(name -> name + " " + name.length())
				.forEach(System.out::println);
	}

}
