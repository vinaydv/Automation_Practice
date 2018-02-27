package com.wipro.day3.main;

public class toggle {
	
	public static void toggleString(String str){
		
		char[] arraystr = str.toCharArray();
		
		
		
		for(int i=0;i<arraystr.length;i++){
			
			if((int)arraystr[i]>=65  && (int)arraystr[i]<=90 ){
				
				System.out.print(Character.toLowerCase(arraystr[i]));
			}
			
			else if( (int)arraystr[i]>=97  && (int)arraystr[i]<=122 ){
				System.out.print(Character.toUpperCase(arraystr[i]));
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toggleString("Vinay D V");
		
		System.out.println();
	}

}
