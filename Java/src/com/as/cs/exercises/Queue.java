package com.as.cs.exercises;

public class Queue {
 private int maxsize; 
 private long[] queueArray;
 private int front;
 private int rear;
 private int nItems;
 


public Queue(int s){
	maxsize =s;
	queueArray= new long[maxsize];
	front = 0;
	rear = -1;
	nItems = 0;
	
}
public void insert(long j){
	String result = rear == maxsize - 1? "Queue full" : addItem(j);
	System.out.println(result);
}

public String addItem(long j){
	queueArray[++rear] = j;
	nItems++;
	return "Item Added";
}

public void remove(){
	String result = rear == -1? "empty queue" : removeItem();
	System.out.println(result);
	
}

public String removeItem(){
	long removedItem = queueArray[front++];
	nItems--;
	return "The item " + removedItem + " from the queue";
	
}


public boolean isEmpty(){
	return nItems ==0;
}

public boolean isFull(){
	return nItems == maxsize;
	
}

public int numItemsInQueue(){
	return nItems;
	
}

public long peek(){
	return queueArray[front];
}
public long[] getArray(){
	return queueArray;
}


}