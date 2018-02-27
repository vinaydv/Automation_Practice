package com.wipro.Taskapp.main;

import java.util.Scanner;

import com.wipro.Taskapp.bean.Task;
import com.wipro.Taskapp.service.TaskService;

public class TaskAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TaskService taskserv = new TaskService();
		
		
		System.out.println("Enter the choice" );
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		while(choice!=3){
			
			switch(choice){
				
			case 1: System.out.println("add new record");
				
			}
			
			
		}
		
	}

}
