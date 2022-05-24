package com.example.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("AAA", 8.3, 2015));
		list.add(new Movie("ZZZ", 8.7, 1977));
		list.add(new Movie("BBB", 8.8, 1980));
		list.add(new Movie("GGG", 8.4, 1983));

		// Here, T should be extended from Comparable
		// public static <T extends Comparable<? super T>> void sort(List<T> list) {
		// list.sort(null);}

		Collections.sort(list);//original list has been modified, 
		//internally Movie class CompareTo() method will be called.
		
		for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
		
		System.out.println(list.toString());
	}

}
