package com.as.cs.exercises;
import java.util.Scanner;
public class TwoDarray {

	public static void main(String[] args) {
		int[][] array = new int[4][5];
		Scanner sc= new Scanner(System.in);
		int max = 0;
		int min = 999;
		int row = 0;
		int collumn = 0;
		for(int i = 0; i <4; i++){
			for(int j=0; j<5; j++){
			
				System.out.print("enter a number");
				array[i][j]= sc.nextInt();
				if(array[i][j]>max) max = array[i][j];{
					System.out.println("maximum number is " + max);
			
					}
				
				
				if(array[i][j]<min) min = array[i][j];{
					System.out.println("minimum number is " + min);
				}
				
				if(array[i][j]==max)  row = i; collumn= j; {
					
			
				}
				if(array[i][j] == min) row =i; collumn = j;{
					
				}
			}
		}
		
		System.out.println("index of max is " + row + " " + collumn);
		System.out.println("index of min is " + row + " " + collumn);
		
		sc.close();
		
	}
}


