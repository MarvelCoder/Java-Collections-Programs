package com.java.oop;

import java.security.SecureRandom;

public class SecureRandomNumber {

	public static void main(String[] args) {
		
		SecureRandom randomNum = new SecureRandom();
		
		final int ARRAY_LENGTH = 10;
		
		final int BOUND = 10;
		
		int[] array = new int[ARRAY_LENGTH];

		for(int i=0;i<array.length;i++) {
			
			++array[randomNum.nextInt(BOUND)];
		}
	
		for(int i=0;i<array.length;i++) {
			System.out.printf("%s%8s%n", i,array[i]);
		}
		
	}

}
