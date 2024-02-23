package com.java.linkedList;

import java.util.HashMap;

public class HashmapUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> numbers = new HashMap<>();
	    numbers.put("First", 1);
	    numbers.put("Second", 2);
	    numbers.put("Third", 3);
	    System.out.println("HashMap: " + numbers);

	    // return the value of key Second
	    int value = numbers.get("Third");

	    // update the value
	    value = value * 10;

	    // insert the updated value to the HashMap
	    numbers.put("Third", value);
	    System.out.println("HashMap with updated value: " + numbers);
	  }
	}


