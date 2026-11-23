package com.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setRoll_No(90);
		e.setName("ABC");
		
		System.out.println("Roll no is:"+e.getRoll_NO());
		System.out.println("Name is:"+e.getName());
	}
}
