package com.oca.testing;
import com.oca.utils.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		
		MyDate date1=new MyDate (01,05,2019);
		
		MyDate date2=new MyDate();
		
		date2.day=11;
		date2.month=11;
		date2.year=2019;
		
		MyDate date3=new MyDate();
		date3.setDate(01,11,2019);
		
		String str1=date1.toString();
		String str2=date2.toString();
		String str3=date3.toString();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	

	}

}