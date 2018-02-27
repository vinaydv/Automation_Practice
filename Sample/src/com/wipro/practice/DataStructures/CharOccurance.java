package com.wipro.practice.DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "initiate";
		int count = 0;
		
		
		
		for(int j=0;j<str.length();j++){
			for(int i=0;i<str.length();i++){
				
				if(str.charAt(j) == str.charAt(i)){
					count++;
					
				}
				
			}
			
			Hashtable<Character, Integer> ht = new Hashtable<>();
			ht.put(str.charAt(j), count);
			//System.out.println("occurence of character " + str.charAt(j)+ " is "+ count);
			count=0;
			
			for(Map.Entry m:ht.entrySet()){
				   System.out.println(m.getKey()+" "+m.getValue());
				  }
			 
			//System.out.println(ht);
		}
		
		 
		
		 
	}
	
	

}
