package com.as.cs.exercises;

public class Linked_List_Controller {

	public static void main(String[] args) {
		

		Linked_List studentDataList= new Linked_List();
		studentDataList.insertFirst("Sam Lister", 16,"selena gomez", true);
		
		studentDataList.insertFirst("Big Andy", 56 ,"justin bieber", true);
		studentDataList.insertFirst("joel", 46,"taylor swift", true);
		studentDataList.insertFirst("Mr price", 67,"ed Sheeran", true);
		
		studentDataList.find(studentDataList);
		
		studentDataList.displayList();
		
	}

}
