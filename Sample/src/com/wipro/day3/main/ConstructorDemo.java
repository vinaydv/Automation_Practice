package com.wipro.day3.main;

import com.wipro.day3.beans.Employee;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Employee employee = new Employee();
		
		String s1 = "vinay";
		String s2 = "vinay";
		
		String s3 = new String("vinay");
		
		String s4 = "vinay";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
		
		
	}

}
