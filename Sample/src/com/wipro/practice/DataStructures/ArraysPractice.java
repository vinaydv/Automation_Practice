package com.wipro.practice.DataStructures;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int size = 10;
		int arr[] =new int[size] ;
		
		for(int i = 0 ; i<size ;i++){
			arr[i] = i;
		}
		
		
		for(int i: arr){
			System.out.println(i);
		}
	}

}
