package com.as.cs.exercises;

public class Calculator {
		private float numOne=0;
		private float numTwo=0;
		
		public float getNumOne(){
			return numOne;
		
		}
		
		public void setNumOne(float numOne){
			this.numOne = numOne;
		}
		
		public float getNumTwo(){
			return numTwo;
		}
		
		public void setNumTwo(float numTwo){
			this.numTwo = numTwo;

		}
		
		public Calculator(){
			
		}
		
		public float add(){
			return numOne + numTwo;
		}
		
		public float subtract(){
			return numOne - numTwo;
		}
		
		public float divide(){
			return numOne / numTwo;
			
		}
		
		public float multiply(){
			return numOne * numTwo;
			
		}
		
		public float areaOfRectangle(){
			return numOne * numTwo;
		}
		
		public float areaOfTriangle(){
			return (numOne * numTwo) / 2;
			
		}
		
		public double areaOfCircle(){
			return (numOne * numOne) * 3.14;
			
		}
		
		
		
}
