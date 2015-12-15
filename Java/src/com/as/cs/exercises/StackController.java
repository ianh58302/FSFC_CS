package com.as.cs.exercises;
import java.util.Scanner;
public class StackController {

	public static void main(String[] args) {
		int stackSize =0;
		
		System.out.println("enter size of stack");
		Scanner sc = new Scanner(System.in);
		stackSize = sc.nextInt();
		
		StackEx stack = new StackEx(stackSize);
		
		for(int i = 0; i < stackSize; i++){
			stack.push((long) (Math.random() * stackSize));
		}
		
		long[] x = stack.getArray();
		for(int i = 0; i<stackSize; i++){
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		stack.pop();
		
		stackSize--;
		
		for(int i = 0; i<stackSize; i++){
			System.out.print(x[i] + " ");
		}
	}

}
