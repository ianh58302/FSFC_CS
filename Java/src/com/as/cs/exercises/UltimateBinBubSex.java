package com.as.cs.exercises;
import java.util.Scanner;
import java.util.Arrays;
public class UltimateBinBubSex {
	
	public static void main(String[] args) {
		int temp = 0;
		int[] a = new int [10];
		for(int i = 0; i < a.length; i++){
			a[i] = (int) (Math.random() *100) ;
			
		}
		for(int i = 0; i <a.length - 1; i++){
			for(int j = 0; j<a.length-1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("What is the Value you wish to search?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		String result = binarySearch(a,x)? "Value found" : "Value not found";
		System.out.println(result);
		sc.close();
	}
	public static boolean binarySearch(int[] array, int searchValue){
		int start = 0;
		int end = array.length - 1;
		
		for(int i = 0; i <array.length; i++){
			int middle = (start + end) / 2;
			if(array[middle] == searchValue){
				return true;
				
			} else if(array[middle] < searchValue){
				start = middle + 1;
				middle = (start + end)/2;
				
			} else{
				end = middle - 1;
				
			}
			
		}
		return false;
		
	}

}
