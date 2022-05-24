package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollectors {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
		
		Stream<Integer> evenArraystream = list.stream();
		Integer[] evenNumbersArr = evenArraystream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);

	}
	
	

}
