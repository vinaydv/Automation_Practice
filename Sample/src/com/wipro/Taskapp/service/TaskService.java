package com.wipro.Taskapp.service;

import com.wipro.Taskapp.bean.Task;

public class TaskService {
	
	private int count = -1;
	Task [] tasks = new Task[10];
	
	public String addTask(Task task){
		
		++count;
		
		if(count>=10){
			return "Array full";
		}
		
		else
		{
			tasks[count] = task;
			return "success";
		}
		
	}
	
	
	public void printArray(){
		
		
		for(int i =0 ; (i<tasks.length) && tasks[i]!=null;i++){
			
			System.out.println(tasks[i].getTaskname());
		}
	}

}
