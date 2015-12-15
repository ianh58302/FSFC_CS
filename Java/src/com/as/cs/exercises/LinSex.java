package com.as.cs.exercises;

public class LinSex {
static int[] a = {5 , 3,4,2,7};
public static boolean LinSex(int [] array, int searchValue){
	for(int i = 0; i <array.length; i++){
		if(array[i] == searchValue){
		return true;
	}
}
return false;
}

public static void main(String[] args) {
	System.out.println(LinSex(a , 4)? "value found":
		 "not there");
	
}
	
}

