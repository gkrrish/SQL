package com.example.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLamdaExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(52);
		list.add(6);

		Comparator<Integer> comparaTo = (one, two) -> {
			if (one > two) return -1;
			else if (one < two) return 1;
			else return 0;
		};
		Collections.sort(list, comparaTo);
		System.out.println(list);
	}

}
