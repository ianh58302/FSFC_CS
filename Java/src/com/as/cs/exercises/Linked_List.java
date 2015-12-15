package com.as.cs.exercises;

public class Linked_List {
  private Linklists first;
  private int numoflinks = 0;
  public void LinkedList(){
	  first = null;
	  
  }
  
  public boolean isEmpty(){
	  return (first==null);
  }
  
  public void insertFirst(String name, int age,String favSinger, boolean inARelationship){
	  Linklists link = new Linklists(name,age,favSinger,inARelationship);
	  
	  if(first!=null){
		  link.setNextLink(first);
		  first=link;
	  }else{
		  first=link;
	  }
	 numoflinks++;
	  
  }
  public Linklists find(Linked_List studentDataList) {
  Linklists nextLink = first;

  while(nextLink != null) {

      if(nextLink == first) {
          return first;
      }
      else {

    	  nextLink = nextLink.getNextLink();
      }
  }
  System.out.println(nextLink);
return nextLink;
  }
  public Linklists deleteFirst(){
	  Linklists deletedLink = first;
	  first = first.getNextLink();
	  return deletedLink;
  }
  public void displayList(){
	  System.out.print("list ( fist--> last) : ");
	  Linklists current = first;
	  
	  while(current!=null){
		  current.displayLink();
		  current=current.getNextLink();
	  }
	  System.out.println(" ");
  }
}
