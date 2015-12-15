package com.as.cs.exercises;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
	int primeNumber = 0;
	int inputValue = 0;
	int remainder = 0;
	int numOffactors = 0;
	Scanner sc = new Scanner(System.in);
	
	inputValue = sc.nextInt();
	
	for(int i = 1; i <= inputValue; i++){
		remainder = inputValue%i;
		
		if(remainder == 0){
			numOffactors++;
		}
		
		
	}
	
	if(numOffactors > 2){
		System.out.println(inputValue + " is not a Prime number");
	}else{
		System.out.println(inputValue + " is a prime number");
	}
	
	}

}
