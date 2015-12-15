package com.as.cs.exercises;

public class BinSex1 {
static int[] a = {0 , 5 , 9 , 15, 30, 68, 89};
static int x = 69;


	public static void main(String[] args) {
	
		String result = binarySearch(a,x)? "Value found" : "Value not found";
		System.out.println(result);
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
