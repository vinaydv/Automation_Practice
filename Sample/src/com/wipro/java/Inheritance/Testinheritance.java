package com.wipro.java.Inheritance;

public class Testinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manager manager = new Manager();
	//	projectManager  pm = new projectManager();
		Employee manager = new Manager();
		
		manager.getempFirstName();
	
		System.out.println(manager.getempFirstName());
		//manager.setEmpFirstname("Vinay");	
	/*	manager.setManegerProject("lowes");
		System.out.println(manager.getempFirstName());
		System.out.println(manager.getManegerProjecte());*/
		
		/*EmployeeUtility.employeedetails(manager);
		EmployeeUtility.employeedetails(new Employee());*/
		//EmployeeUtility.employeedetails(manager);
		

	}

}