package com.as.cs.exercises;

public class StackEx {
private int maxSize;
private long[]stackArray;
private int top = -1;

public StackEx(int maxSize){
	this.maxSize = maxSize;
	this.top=-1;
	stackArray=new long[maxSize];
	
}

public void push(long j){
	String result = top == stackArray.length -1? "stack is full":pushItem(j);
	System.out.println(result);
}

public String pushItem(long j){
	top = top +1;
	stackArray[top] = j;
	return j + " added to stack";
}

public void pop(){
	String result = top == -1?"Stack is empty":popItem();
	System.out.println(result);
}

public String popItem(){
	return "item " + stackArray[top--] + " has been removed from the stack";
}
public boolean isEmpty(){
	return(top==-1);
}
public boolean isFull(){
	return(top == stackArray.length - 1);
}
public long[] getArray(){
	return stackArray;
}
}
