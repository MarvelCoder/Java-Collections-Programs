package com.java.oop;

public class InitArray {

	public static void main(String[] args) {
	
		final int ARRAY_LENGTH = 10;
		
		int[] array = new int[ARRAY_LENGTH];
		
//		int[] array = {32,43,545,23,12,435,21,35,57,234};
		
		System.out.printf("%s%7s%n", "Index", "Value");
		
		for(int i=0;i<array.length;i++) {
			System.out.printf("%d%8d%n",i,array[i]);
		}

		System.out.println();
	}

}
