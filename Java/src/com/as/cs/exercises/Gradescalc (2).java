package com.as.cs.exercises;

public class Gradescalc {

	public static void main(String[] args) {
		float quiz,midterm,finals,average;
		Grades percentcalc = new Grades();
		
		quiz=Float.parseFloat(args[0]);
		midterm=Float.parseFloat(args[1]);
		finals=Float.parseFloat(args[2]);
		average = (float)(quiz + midterm + finals) / 3;
		
	percentcalc.setQuiz(quiz);
	percentcalc.setMidterm(midterm);
	percentcalc.setfinals(finals);
	
	
	if(average>=90){
		System.out.println("Grade A");
		System.out.println("Amazing!");
		
	
	} else if(average >= 70){
		if(average<90){
			System.out.println("Grade B");
			System.out.println("Good job!");
	
	}else if(average>=50){
		if(average<70){
			System.out.println("Grade C");
			System.out.println("You pased!");
		}else if(average<50){
			System.out.println("Grade F");
			System.out.println("Better luck next time");
		}
	}
	

	
	}

}
}