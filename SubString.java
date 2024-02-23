package com.java.linkedList;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String txt = "This is Nagpur";
		    String str1 = "Pune";
		    String str2 = "Nagpur";

		    // check if name is present in txt
		    // using contains()
		    boolean result = txt.contains(str1);
		    if(result) {
		      System.out.println(str1 + " is present in the string.");
		    }
		    else {
		      System.out.println(str1 + " is not present in the string.");
		    }

		    result = txt.contains(str2);
		    if(result) {
		      System.out.println(str2 + " is present in the string.");
		    }
		    else {
		      System.out.println(str2 + " is not present in the string.");
		    }
		  }
	}


