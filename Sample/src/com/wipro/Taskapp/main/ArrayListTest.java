package com.wipro.Taskapp.main;

import java.util.Scanner;

import com.wipro.Taskapp.bean.Task;
import com.wipro.Taskapp.service.TaskService;
import com.wipro.Taskapp.service.TaskService1;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TaskService1 taskserv = new TaskService1();
		
		System.out.println("Enter the choice" );
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		
		while(choice!=3){
			
			switch(choice){
				
			case 1: System.out.println("add new record");
			
			Task task = new Task("task1" , "abc" ,10, "abc");
			taskserv.addTask(task);
			break;
			
			case 2: System.out.println("details are");
			taskserv.display();
			break;
				
			}
			System.out.println("Enter the choice" );
			
			
		}

	}

}
