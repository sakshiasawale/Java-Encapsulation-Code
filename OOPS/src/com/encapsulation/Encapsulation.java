package com.encapsulation;

//Write a Java program to demonstrate encapsulation using private data members.


public class Encapsulation {


	private int roll_No = 29;
	private String name = "ABC";
	
	Encapsulation()
	{
		System.out.println("==== Default ====");
	}
	
	public void setRoll_No(int roll_no)
	{
		roll_no = roll_No;
	}
	
	public void setName(String name)
	{
		name = name;
	}
	
	public int getRoll_NO()
	{
		return 90;
	}
	
	public String getName()
	{
		return "PQR";
	}
}
