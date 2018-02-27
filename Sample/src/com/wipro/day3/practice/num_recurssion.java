package com.wipro.day3.practice;

public class num_recurssion {

	
	public void num(int n){
		
		
		
		if(n>1)
		num(n-1);
		
		System.out.println(n);
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		num_recurssion obj = new num_recurssion();
		
		obj.num(5);

	}

}
