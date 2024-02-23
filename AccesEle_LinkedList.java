package com.java.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AccesEle_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		
	//add element
	fruits.add("apple");
	fruits.add("orange");
	fruits.add("banana");
	fruits.add("papita");
	System.out.println(fruits);
	
	//access element
	 String str = fruits.get(1);
	System.out.println(str);
	
	Iterator<String> iterator = fruits.iterator();
	
	
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
	
	

	}

}
