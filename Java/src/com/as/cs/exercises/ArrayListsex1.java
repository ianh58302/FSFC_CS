package com.as.cs.exercises;
import java.util.ArrayList;
import java.util.List;
public class ArrayListsex1 {
	public static void main(String[] args) {
		
		
		List <String> list = new ArrayList<>();
		list.add(0, "one");
		list.add(1, "two");
		list.add(2, "three");
		list.add(3, "four");
		list.add(4, "five");
		list.add(5, "six");
		System.out.println("the original list is" + list);
		for(int i = 0; i < list.size()-1; i++){
			String a = list.get(i);
			list.set(i,list.get(i+1));
			list.set(i+1,a);
			}
			
		
		
		System.out.println("the original list is" + list);
	}
	
}