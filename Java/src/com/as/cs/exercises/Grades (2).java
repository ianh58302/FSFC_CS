package com.as.cs.exercises;

public class Grades {
	private float quiz = 0;
	private float midterm =0;
	private float finals=0;
	private float average = 0;
	public float getQuiz(){
		return quiz;
	}
	
	public void setQuiz(float quiz){
		this.quiz = quiz;
	}
	
	public float getMidterm(){
		return midterm;
	}
	
	public void setMidterm(float midterm){
		this.midterm = midterm;
		
	}
	
	public float getfinals(){
		return finals;
	}
	
	public void setfinals(float finals){
		this.finals = finals;
	}
	
	public float getAverage(){
		return average;
	}
	
	public float average(){
		average =(float)(quiz + midterm + finals);
		return (quiz + midterm + finals) / 3;
	}
	
	
	
	public Grades(){
		
	
	}
}
