package com.as.cs.exercises;

public class Bubblesort {

	public static void main(String[] args) {
		int[] a = {9,5,1,3,10};
		int temp = 0;
		for(int i = 0; i <a.length - 1; i++){
			for(int j = 0; j<a.length-1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
for(int i=0;i<a.length;++i){
	System.out.print(a[i] + " ");
}
	}

}
