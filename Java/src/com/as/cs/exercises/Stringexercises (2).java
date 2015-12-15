package com.as.cs.exercises;

public class Stringexercises {

	public static void main(String[] args) {
		String firstName = "ian ";
		String lastName = "hunt";
		
	String fullName = firstName.concat(lastName);
	
	System.out.println(fullName);
	
	System.out.println(fullName.equals(firstName + lastName));
	
	String firstName2 = new String("ian");
	
	System.out.println(firstName2.equals(firstName));
	
	System.out.println(firstName==firstName2);
	
	System.out.println(fullName==firstName + lastName);
	
	String str="joeyjoejoejrshabadoo";
	String subStringOne = str.substring(0,8);
	System.out.println(subStringOne);
	
	String str1="joeyjoejoejrshabadoo";
	String subStringTwo =str1.substring(10);
	System.out.println(subStringTwo);
	
	System.out.println(str==str1);
	System.out.println(str.equals(str1));
	
	String str3 = new String("joeyjoejoejrshabadoo");
	
	System.out.println(str.equals(str3));
	System.out.println(str==str3);
	
	String s1 = new String("lajeshuwar");
	String s2 = "lajeshuwar";
	String s3 = "lajeshuwar";
	if(s1==s2);
	System.out.println(s1==s2);
	if(s1==s3);
	System.out.println(s1==s3);
	if(s2==s3);
	System.out.println(s2==s3);
	
	
	}

}
