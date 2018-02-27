package com.wipro.day3.beans;

public class Employee {
	
	private String employeeID;
	private String empFirstName;
	private int empSal;
	private int count;
	
	public Employee(){
		this.empFirstName = "Vinay";
		System.out.println(empFirstName);
	}
	
	
	
	public void setEmpID(String employeeID){
		this.employeeID = employeeID;
	}
	
	
	
	public void setEmpFirstname(String empFirstName){
		this.empFirstName = empFirstName;
	}
	
	public void setEmpsal(int empSal ){
		this.empSal = empSal;
	}
	
	
	public String getempID(){
		return employeeID;
	}
	
	public String getempFirstName(){
		return empFirstName;
	}
	
	public int getempSal(){
		return empSal;
	}
	
	public String generateID(){
		
		String first2char = this.empFirstName.substring(0, 2);
		return first2char + ++count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	}

}
