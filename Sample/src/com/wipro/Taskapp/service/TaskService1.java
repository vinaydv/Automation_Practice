package com.wipro.Taskapp.service;

import java.util.ArrayList;

import com.wipro.Taskapp.bean.Task;

public class TaskService1 {

	//  generics   <>
	
	
	ArrayList<Task> tasks = new ArrayList<Task>();
	
     public String addTask(Task task){
		try{
			tasks.add(task);
			
			return "success";
		}catch(Throwable e){
			System.out.println(e.getMessage());
			return "failure";
		}
	}
     
     
     public void display(){
    	 
    	 if(tasks.isEmpty()){
    		 System.out.println("Empty list");
    	 }
    	 
    	 else{
    		 for(int i = 0 ;i<tasks.size();i++){
    			 System.out.println(tasks.get(i));
    		 }
    	 }
     }
     
     
     
     
}
