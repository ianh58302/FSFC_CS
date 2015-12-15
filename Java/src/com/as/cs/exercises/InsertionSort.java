package com.as.cs.exercises;
import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {22, 5, 56, 49, 2};
		int tempval = 0;
		int currentPos = 1;
		for(currentPos = 1; currentPos < a.length; ++currentPos){
			while(currentPos >0 && a[currentPos] < a[currentPos- 1]){
				tempval = a[currentPos];
				a[currentPos] = a[currentPos - 1];
				a[currentPos - 1] = tempval;
				--currentPos;
			}
		}
		
System.out.println(Arrays.toString(a));
	}

}
