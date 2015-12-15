package com.as.cs.exercises;

import java.util.Scanner;

public class BubSex1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("enter length of array");
		num = sc.nextInt();
		int[] a = new int[num];
		int temp = 0;
		System.out.println("enter content of array");
		for(int j = 0; j <a.length; j++){
			a[j] = sc.nextInt();
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
for(int i=0;i<a.length;++i){
	System.out.print(a[i] + " ");
}
sc.close();
	}
}
