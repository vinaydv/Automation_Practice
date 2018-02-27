package com.wipro.day3.main;

import com.wipro.day3.beans.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		
		
		
		employee.setEmpFirstname("Vinay");
		employee.setEmpsal(40000);
		
		
		System.out.println("employee ID is  : "  + employee.getempID());
		System.out.println("employee name is: "  + employee.getempFirstName());
		System.out.println("employee sal  is: "  + employee.getempSal());
		System.out.println("ID   :" + employee.generateID());
		
		
	}

}
