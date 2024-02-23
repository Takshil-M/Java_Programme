package com.java.linkedList;

public class AccessPrivateMem {
	
	
	private double salary;
	private String name;
	
	public void setSal(double salary) {
		this.salary=salary;
	}
	public void setnam(String name) {
		this.name=name;
	}
	
	public double getSal() {
		return this.salary;
	}
	
	public String getnam() {
		return this.name;
	}


	public static void main(String[] args) {
		
		AccessPrivateMem accessPrivateMem = new AccessPrivateMem();
		accessPrivateMem.setSal(30000);
		accessPrivateMem.setnam("Takshil");
		
		System.out.println(accessPrivateMem.getnam());
		System.out.println(accessPrivateMem.getSal());
		

	}

}
