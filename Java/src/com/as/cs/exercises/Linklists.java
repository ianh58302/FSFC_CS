package com.as.cs.exercises;

public class Linklists {
 private String name;
 private int age;
 private String favSinger = "tay tay";
 private boolean inARelationship = false;

 private Linklists nextLink = null;
 

 

 
 public Linklists(String name, int age, String favSinger, boolean inARelationship){
	 this.name = name;
	 this.age = age;
	 this.favSinger = favSinger;
	 this.inARelationship=inARelationship;
 }

public String getName(){
	return name;
	
}
 public void setName(String name){
	 this.name=name;
 }
 
 public int getAge(){
	 return age;
 }
 public void setAge(int age){
	 this.age = age;
 }
 public String getFavSinger(){
	 return favSinger;
 }
 public void setFavSinger(String favSinger){
	 this.favSinger = favSinger;
 }
 public boolean isInARelationship(){
	 return inARelationship;
 }
 public void setInARelationship(boolean inARelationship){
	 this.inARelationship=inARelationship;
 }
 public Linklists getNextLink(){
	 return nextLink;
 }
 public void setNextLink(Linklists nextLink){
	 this.nextLink = nextLink;
 }


 public void displayLink(){
	 
	 System.out.println("***********");
	 
	 System.out.println(" ");
	 System.out.println("name: " + this.getName());
	 System.out.println("age: " + this.getAge());
	 System.out.println("Singer: " + this.getFavSinger());
	 System.out.println("In a relationship? " + this.isInARelationship());
	 
	 System.out.println(" ");
	 System.out.println("***********");
 }
}

