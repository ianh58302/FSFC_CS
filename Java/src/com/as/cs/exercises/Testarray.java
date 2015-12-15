package com.as.cs.exercises;

public class Testarray {
	
	public static void main(String[] args){
		int[] list={1, 2, 5, 7, 10};
		for(int i = 0; i< list.length; i++){
			System.out.println(list[i] + " ");
		}
		
		int total = 0;
		
		for(int i = 0; i < list.length; i++){
			total = total + list[i];
			
		}
		System.out.println("total is " + total);
		
		int max = list[0];
		
		for(int i = 1; i<list.length; i++){
			if(list[i]>max)
				 max = list[i];
			}
		System.out.println(max);
		}
	}

