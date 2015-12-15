package com.as.cs.exercises;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(5);
		set1.add(7);
		set1.add(110);
		set1.add(0);
		
		set1.add(1);
		System.out.println(set1);
		
		if(set1.contains(5)){
			System.out.println("This set contains 5");
			
		}
		
		if(set1.contains(70)){
			System.out.println("this set contains 70");
		}else{
			System.out.println("this set doesnt contain 70");
		}
		for(int element: set1){
			System.out.println(element);
		}
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(5);
		set2.add(20);
		set2.add(6);
		set2.add(9);
		
		Set<Integer> intersection = new HashSet<>(set2);
		
		intersection.retainAll(set1);
		System.out.println(intersection);
		
		Set<Integer> difference = new HashSet<>(set1);
		
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
