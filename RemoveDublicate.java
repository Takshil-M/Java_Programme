package com.java.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
		    System.out.println("ArrayList with duplicate elements: " + numbers);

		    // convert the arraylist into a set
		   Set hashSet = new HashSet(numbers);
		   System.out.println(hashSet);

}
}