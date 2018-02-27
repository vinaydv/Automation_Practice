package com.wipro.java.Multithreading;

public class MultithreadingDemo extends Thread {
	
	
	public static MultithreadingDemo demo;

	public void run(){
		
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		for(int i = 0;i<n;i++){
	 demo = new MultithreadingDemo();
			demo.start();
			demo.stop();
		}
	
		
		
		

	}

}
