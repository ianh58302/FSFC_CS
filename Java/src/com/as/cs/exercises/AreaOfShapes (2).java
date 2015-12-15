package com.as.cs.exercises;

public class AreaOfShapes {
		private float numOne = 0;
		private float numTwo = 0;
		private double numThree = 0;
		
		
		public float getNumOne(){
			return numOne;
		}
		
		public void setNumOne(float numOne){
			this.numOne= numOne;
			
		}
		
		public float getNumTwo(){
			return numOne;
			
		}
		
		public void setNumTwo(float numTwo){
			this.numTwo= numTwo;
			
		}
		
		public double getNumThree(){
			return numThree;
		}
		
		public void setNumThree(double numThree){
			this.numThree= numThree;
			
		}
		
		public AreaOfShapes(){
			
		}
		
		public float areaoftriangle(){
			return (numOne * numTwo) / 2;
			
		}
		
		public float areaofrectangle(){
			return numOne * numTwo;
			
		}
		
		public double areaofcircle(){
			return (numThree * numThree) * 3.14;
			
		}
}
