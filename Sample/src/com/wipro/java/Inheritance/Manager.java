package com.wipro.java.Inheritance;

public class Manager extends Employee{
	
	
	public String projectname;
	
	
	public Manager(){
		
		//super();
		
		System.out.println("Manager No-arg constructor");
		
	}
	
	public Manager(String projectname){
		
		this.projectname = projectname;
	}
	
	
	public void setManegerProject(String projectname){
		this.projectname = projectname;
	}
	
	
	public String getManegerProjecte(){
		return projectname;
	}
	
	public float calculateSalary(){
		return 2000;
	}
	

}
