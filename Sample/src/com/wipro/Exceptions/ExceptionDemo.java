package com.wipro.Exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			throw new MyException("user defined exception");
		}catch(Exception e){
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}

	}

}
