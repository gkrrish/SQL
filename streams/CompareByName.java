package com.example.streams;

import java.util.Comparator;

public class CompareByName implements Comparator<NewMovie> {

	@Override
	public int compare(NewMovie movieOne, NewMovie movieTwo) {
		return movieOne.getName().compareTo(movieTwo.getName());
	}

}
