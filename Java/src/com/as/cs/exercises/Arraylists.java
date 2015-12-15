package com.as.cs.exercises;
import java.util.List;
import java.util.ArrayList;
public class Arraylists {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<>();
	
		obj.add("john");
		obj.add("sam");
		obj.add("jack");
		obj.add("mr price");
		obj.add("big andy");
		
		
		System.out.println("The Array list has the following elements: " + obj);
		
		obj.add( 0, "emily");
		obj.add(3, "wayne");
		obj.add(4, "joel");
		System.out.println("The Array list has the following elements: " + obj);
		
		obj.remove("john");
		obj.remove("jack");
		obj.remove("wayne");
		obj.remove(1);
		System.out.println("The Array list has the following elements: " + obj);
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		if(obj.contains("big andy")){
			System.out.println("big andy is here!!");
		}else{
			System.out.println("false");
			obj.set(0, "sam");
			System.out.println("The Array list has the following elements: " + obj);
		}
		obj.set(0, "sam");
		System.out.println("The Array list has the following elements: " + obj);
		System.out.println(obj.subList(0, 2));
	List<String> obj2=new ArrayList<>();
	obj2.add("ian");
	obj2.add("john");
	
	obj.addAll(obj2);
	System.out.println(obj);
	}

	
	}

