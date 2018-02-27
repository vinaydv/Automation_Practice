package com.wipro.day3.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1 , 8, 7 , 4};
		
		for(int i = 0;i<a.length;i++)
			System.out.print(" " + a[i]);
		Arrays.sort(a);
		System.out.println(" ");
		for(int i = 0;i<a.length;i++)
		System.out.print(" " + a[i]);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		/*al.add(2);
		al.add(5);
		al.add(10);
		al.add(4);
		al.add(4);
		al.add(100);
		
		System.out.println(al);
		
		HashSet a = new HashSet<>(al);
		
		SortedSet set = new TreeSet(al);
		
		System.out.println(set);
		
		System.out.println(a);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println("Second largest is : " + al.get(al.size()-2));*/
	}

}
