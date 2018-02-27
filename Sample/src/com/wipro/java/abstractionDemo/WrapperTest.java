package com.wipro.java.abstractionDemo;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = new Integer(10);//unboxing   object to primitive
		//primitive is assigned with object-----hence unboxing
		
		Integer b = new Integer(5);
		
		int c = b;
		
		Integer d= 100; //autoboxing
		
		System.out.println(d.equals(100));
	}

}
