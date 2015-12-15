package com.as.cs.exercises;
import java.util.*;
public class Age {

	public static void main(String[] args) {
		int age= 0;
		int inputValue = 0;
		
		System.out.println("what is your age?");
		Scanner sc=new Scanner(System.in);
		
		inputValue = sc.nextInt();
		
		while(inputValue!=999){
			System.out.println("congratulations on being " + inputValue);
			System.out.println("Try again");
			inputValue =sc.nextInt();
		}
		
		while(inputValue==999){
			System.out.println("invalid");
			System.out.println("try again");
			inputValue = sc.nextInt();
		}
		
	
		
		
sc.close();
	}
	


}
