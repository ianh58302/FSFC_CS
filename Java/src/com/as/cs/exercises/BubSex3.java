package com.as.cs.exercises;
public class BubSex3 {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		long b = System.currentTimeMillis();
		
		int[] a = new int [5];
		
		for(int i = 0; i < a.length; i++){
			a[i] = (int) (Math.random() *100 );
			
		}
		
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
	System.out.println(a[i]);
}
System.out.println(System.currentTimeMillis());
long c = System.currentTimeMillis();

System.out.println(c - b );
	}

}
