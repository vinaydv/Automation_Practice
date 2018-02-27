package com.wipro.day3.practice;

public class palindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "malayalam";
		String a = new StringBuffer(str).reverse().toString();
		
		
		
		if(a.equals(str)){
			System.out.println("String is a palindrome");
		}
		else
			System.out.println("String is not a palindrome");
	
	}

}
