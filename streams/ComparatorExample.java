package com.example.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<NewMovie> list = new ArrayList<>();
		list.add(new NewMovie("AAA", 8.3, 2015));
		list.add(new NewMovie("ZZZ", 8.7, 1977));
		list.add(new NewMovie("BBB", 8.8, 1980));
		list.add(new NewMovie("GGG", 8.4, 1983));

		// here,we are creating the new Comparator class and implementing the
		// own logic, after that we are passing that object to Collections.list method

		CompareByName compareByName = new CompareByName();
		Collections.sort(list, compareByName);

		for (NewMovie newMovie : list) {
			System.out.println(newMovie.getName() + " " + newMovie.getRating() + " " + newMovie.getYear());
		}

		System.out.println(list.toString());
	}

}
/*
 * //A comparable object is capable of comparing itself with another object
 * //actual object will be modified class MyComparable implements
 * Comparable<Integer> {
 * 
 * @Override public int compareTo(Integer o) { return 0; } }
 * 
 * class MyComparator implements Comparator<Integer>{
 * 
 * @Override public int compare(Integer o1, Integer o2) { return 0; }
 */
/*
 * List<Integer> listSort = new ArrayList<>(); listSort.add(10);
 * listSort.add(6);
 * 
 * Collections.sort(null, null);
 */
