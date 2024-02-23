package com.java.linkedList;

import java.util.LinkedList;

public class removeEle_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList<String> car = new LinkedList<String>();
		
		//add element
		car.add("shift");
		car.add("omni");
		car.add("brezza");
		car.add("mini copper");
		System.out.println(car);
		
		//remove
		car.remove(1);
		System.out.println(car);
		

	}

}
