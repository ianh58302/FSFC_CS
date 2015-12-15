package com.as.cs.exercises;
import java.util.Scanner;
public class Oddoreven {

	public static void main(String[] args) {
		int inputValue = 0;
		
		Scanner sc = new Scanner(System.in);
		inputValue = sc.nextInt();
		if( inputValue%2 >0){
			System.out.println(inputValue + (" is odd"));
		}else{
			System.out.println(inputValue+ (" is even"));
		}
		

	}

}
