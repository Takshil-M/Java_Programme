package com.java.linkedList;

import java.util.HashSet;
import java.util.Set;

public class ItrateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an set
	    Set<String> languages = new HashSet<>();
	    languages.add("Java");
	    languages.add("JavaScript");
	    languages.add("Python");
	    System.out.println("Set: " + languages);

	    // Using forEach loop
	    System.out.println("Iterating over Set using for-each loop:");
	    for(String language : languages) {
	      System.out.print(language);
	      System.out.print(", ");
	    }
	  }
	}


