package com.java.linkedList;

import java.util.HashSet;
import java.util.Set;

public class DiiffTwoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Integer> numbers = new HashSet<>();
		    numbers.add(1);
		    numbers.add(2);
		    numbers.add(3);
		    numbers.add(4);
		    System.out.println("Numbers: " + numbers);

		    // create second set
		    Set<Integer> primeNumbers = new HashSet<>();
		    primeNumbers.add(2);
		    primeNumbers.add(3);
		    System.out.println("Prime Numbers: " + primeNumbers);

		    // Difference between HashSet1 and HashSet2
		    numbers.removeAll(primeNumbers);
		    System.out.println("Numbers without prime numbers: " + numbers);
		    }
	}


