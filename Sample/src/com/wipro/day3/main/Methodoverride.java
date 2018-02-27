package com.wipro.day3.main;



class vehicle{
	void run(){
		System.out.println("Vehicle is running");
	}
}

public class Methodoverride extends vehicle {
	
	
	
	
	void run(){
		System.out.println("Bike is running");
	}
	
	
	//overloading with
	void run(String str){
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		vehicle obj = new Methodoverride();
		obj.run();
	}

}
