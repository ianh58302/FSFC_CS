package com.as.cs.exercises;

public class CalculatorController {

	public static void main(String[] args) {
		float numOne, numTwo;
		Calculator ianscalculator = new Calculator();
		
		
		numOne=Float.parseFloat(args[0]);
		numTwo=Float.parseFloat(args[1]);
		
		ianscalculator.setNumOne(numOne);
		ianscalculator.setNumTwo(numTwo);
		
		System.out.println("Adding= " + ianscalculator.add() );
		System.out.println("Subtracting= " + ianscalculator.subtract());
		System.out.println("Dividing= " + ianscalculator.divide());
		System.out.println("Multiplying= " + ianscalculator.multiply());
		System.out.println("Area Of Rectangle " + ianscalculator.areaOfRectangle());
		System.out.println("Area Of Triangle " + ianscalculator.areaOfTriangle());
		System.out.println("Area of circle " + ianscalculator.areaOfCircle());
		
		
		
		}

	}

