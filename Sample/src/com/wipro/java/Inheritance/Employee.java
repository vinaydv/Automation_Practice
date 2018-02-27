package com.wipro.java.Inheritance;

public  class Employee {
	
	
	private String employeeID;
	private static String empFirstName;
	private int empSal;
	private int count;
	
	
	
	public Employee(){
		
		System.out.println("Employee no-arg constructor");
		
	}
	
	public  Employee(String empFirstNAme, int  empsal){
		this.empFirstName = empFirstNAme;
		this.setSal(empsal);
		
	}
	
	public void setEmpFirstname(String empFirstName){
		this.empFirstName = empFirstName;
	}
	
	
	public static String getempFirstName(){
		return empFirstName;
		
		
	}
	
	public float calculateSalary(float sal){
		return sal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", empSal=" + empSal + ", count=" + count + "]";
	}
	
	public void setSal(int empsal){
		
		
		if(empsal>0){
			this.empSal = empsal;
		}
		
		else{
			try{
				throw new Invalid_salary_exception("salary is negative");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Exception caught");
			}
		}
	}
	
	
	
	

}
