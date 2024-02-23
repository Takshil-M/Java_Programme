package com.java.linkedList;

import java.util.LinkedList;

public class AddEle_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> car = new LinkedList<String>();
		
		//add element
		car.add("shift");
		car.add("omni");
		car.add("brezza");
		car.add("mini copper");
		System.out.println(car);
		
		car.add(0,"ritz");
		System.out.println(car);
	}

}
