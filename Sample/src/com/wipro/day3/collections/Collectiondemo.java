package com.wipro.day3.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collectiondemo {
	
	
	
	public void Listdemo(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(2);
		list.add(2);
		
		ArrayList<Integer>  list2 = new ArrayList<>();
		
		list2.add(4);
		list2.add(5);
		
		list.add(2, 3);
		
		list.addAll(2,list2);
		
		//list.removeAll(list2);
		
		//Collections.sort(list);
		
		System.out.println(list);
	}
	
	public void hashset(){
		
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>();
		
		
		Set<String>  set = new HashSet<>();
		hs.add(2);
		hs.add(2);
		hs.add(100);
		hs.add(45);
		hs.add(1);
		hs.add(10);
		hs.add(4);
		
		hs1.add(1000);
		
		hs.addAll(hs1);
		
		
		
		
		
		
		TreeSet<Integer> tset = new TreeSet<>(hs);
		System.out.println(tset);
		//System.out.println(tset);
		//System.out.println(set);
		
	}
	
	public void hashtable(){
		
		Hashtable<Character, Integer> ht = new Hashtable<>();
		
		ht.put('a', 200);
		ht.put('a', 400);
		ht.put('b', 500);
		
		
		for(Map.Entry m:ht.entrySet()){
			   System.out.println(m.getKey()+" "+m.getValue());
			  }
		System.out.println(ht);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collectiondemo obj = new Collectiondemo();
		
		//obj.hashset();
		obj.Listdemo();

	}

}
