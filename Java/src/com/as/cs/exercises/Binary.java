package com.as.cs.exercises;
import java.util.*;
public class Binary {
 
	public static void main(String[] args) {
		int numOfnonbinary = 0;
		String inputValue = " ";
		Scanner sc = new Scanner(System.in);
		inputValue = sc.next();

		for(int i=0; i< inputValue.length();i++){
			String ch= inputValue.substring(i,i+1);
			int nextNumber = Integer.parseInt(ch);
			if(nextNumber >1 ){
				numOfnonbinary++;
			}
		}
		
		if(numOfnonbinary>0){
			System.out.println("Not a binary");
		}
		else{
			System.out.println("it is binary");
		}
	}
}



