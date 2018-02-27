package com.wipro.java.abstractionDemo;

public abstract class SuperHero {
	
	private static String country;
	private static String color;
	
	public SuperHero(String country,String color){
		
		this.Setdetails(country, color);
		
	}
	 abstract void power();
	
	
	
	
	public void Setdetails(String country,String color){
		this.country = country;
		this.color=color;
		
		
	} 
	
	public static String getDetails(){
		
		
		return country;
		
	}
	
	

}
