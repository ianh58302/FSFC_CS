package com.as.cs.exercises;

public class IfandLoops {

	public static void main(String[] args) {
		int x = 10;
		
		if(x < 20){
			System.out.println("x is less than 20");
			
			
		}
		
		int x1 = 64;
		
		if(x1 < 50){
			System.out.println("X is less than 50");
			
		}else if(x1 == 50){
			System.out.println("x1 is equal to 50");
			
		}else if(x1>50){
			System.out.println("x1 is greater than 50");
			
		}
		
		char grade = 'A';
		 
		 switch(grade){
		 
		 case 'A':
			 System.out.println("Perfecto!");
			 break;
		 case 'B':
			 System.out.println("mumma mia");
			 break;
		 case 'c':
			 System.out.println("bad boy");
			 break;
		 case 'D':
			 System.out.println("you are no longer my son");
			 break;
		 case 'f':
			 System.out.println("you bring shame to our family monsiour");
		 break;
		 default:
			 System.out.println("invalid grade");
			 
		
		}
		 System.out.println("your grade is " + grade);
		
		 int numpets = 7;
			String petStatus = (numpets < 5)? "within limit":"exceeded limit";
			
			System.out.println("your pet status is: " + petStatus);
	}
			
			
			
			
			
}
