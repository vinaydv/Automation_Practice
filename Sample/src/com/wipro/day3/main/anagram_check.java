package com.wipro.day3.main;

import java.util.Arrays;

public class anagram_check {
	
	
	public static void isAnagram(String str1,String str2){
		String s1 = str1.replaceAll("\\s","");
		String s2 = str2.replaceAll("\\s","");
		
		
	
		
		
		boolean status;
		
		if(s1.length()!=s2.length()){
			status = false;
		}
		
		else{
			char[] Arrays1 = s1.toLowerCase().toCharArray();
			char[] Arrays2 = s2.toLowerCase().toCharArray();
			
			
			
			
			Arrays.sort(Arrays1);
			Arrays.sort(Arrays2);
			
			status = Arrays.equals(Arrays1, Arrays2);
			
		}
		
		if(status==true){
			System.out.println("Strings are angram ");
		}
		
		else{
			System.out.println("Strings are not anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isAnagram("listen","silent");
		
	}

}
