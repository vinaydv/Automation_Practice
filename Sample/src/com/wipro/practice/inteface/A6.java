package com.wipro.practice.inteface;


interface printable{
	void print();
	
	void display();
}

 class class2 implements printable{
	
	public void print(){
		System.out.println("implementing interface in class2");
	}
	
	public void display(){
		System.out.println("implementing interface in class2");
	}
	
	
	public void display(String abc){
		System.out.println("implementing interface in class2 with argument" +  abc);
	}
}


public class A6 implements printable{
	
	public void print(){
		System.out.println("implementing interface");
	}
	
	public void display(){
		System.out.println("implementing interface");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*A6 obj = new A6();
		obj.print();*/
		
		
		class2 objclass2 = new class2();
		objclass2.print();
		objclass2.display("vinay");
	}

}
