package com.wipro.day3.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class concatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[] = { 1 , 2 ,3 };
		Integer b[] = { 5 , 9 , 4 , 0};
		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		
		list.remove(200);
		
		
		
		
		list.toArray(new Integer[0]);
		
		System.out.println(list);
	}

}
