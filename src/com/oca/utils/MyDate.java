package com.oca.utils;

public class MyDate {
	//Member/ instance varialble/fiels /proprietis/atributes
	public int day;
	public int month;
	public int year;
	//Constructors:
	//1.Same name as the class
	//2.No return type
	
	//The no-argument constructor
	public MyDate() {
		
	}
	//Constructor that takes 3 arguments
	public MyDate(int m,int d,int y) {
		setDate(m,d,y);
	}
    //Methods
	public String toString() {
		return month+"/"+day+"/"+year;
	}
	 public void setDate(int m, int d, int y) {
	    day     = d;  
	    year     = y;  
	    month    = m;  
	 }
	 
	 
} 

