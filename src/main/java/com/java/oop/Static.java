package com.java.oop;

import java.util.Scanner;

public class Static {

	public static void main(String[] args) {
		
		System.out.print("Enter three floating-point values seperated by spaces:");
		
		Scanner input = new Scanner(System.in);
		
		double num1 = input.nextDouble();
		
		double num2 = input.nextDouble();
		
		double num3 = input.nextDouble();
		
		System.out.println();
		
		System.out.println("My implementation results, Maximum is " +findMaximum(num1,num2,num3));
		
		System.out.println("Inbuilt Library implementation results, Maximum is " +findMax(num1,num2,num3));
		
		input.close();
	}

	
	public static double findMaximum(double num1, double num2,double num3) {
		
		double maximum = num1;
		
		if(maximum < num2)
			maximum = num2;
		
		if(maximum < num3)
			maximum = num3;
		
		return maximum;
		
	}
	
	public static double findMax(double num1, double num2,double num3) {
		
		double maximum = Math.max(Math.max(num1, num2), num3);
		
		return maximum;
	}
	
}
