package com.wipro.Taskapp.main;

import java.util.TreeSet;
import com.wipro.Taskapp.bean.Task;
public class TaskTreeset {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TreeSet<Task> treeset = new TreeSet<>();
		
		treeset.add(new Task("task3" , "abc" ,10, "abc") );
		
		treeset.add(new Task("task1" , "abc" ,12, "abc") );
		
		System.out.println(treeset);
		
	}

}
