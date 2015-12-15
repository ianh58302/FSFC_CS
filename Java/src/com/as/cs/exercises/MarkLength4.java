package com.as.cs.exercises;
import java.util.List;
import java.util.ArrayList;
public class MarkLength4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		String word1= new String("my");
		String word2= new String("good");
		String word3= new String("mate");
		String word4= new String("sam");
		String word5= new String("is");
		String word6= new String("a");
		String word7= new String("cool");
		String word8= new String("dude");
		String word9= new String("idiot");
		String word10= new String("man");
		
		list.add(0,word1);
		list.add(1,word2);
		list.add(2,word3);
		list.add(3,word4);
		list.add(4,word5);
		list.add(5,word6);
		list.add(6,word7);
		list.add(7,word8);
		list.add(8,word9);
		list.add(9,word10);
		System.out.println(list);
	for(int i=0; i<list.size(); i++ ){
		list.set(i,"****");
	
	}
	System.out.println(list);
	}

}
