package com.java.oop;
public class ConstructorTest {

	public static void main(String[] args) {
		
		Constructor accountObj1 = new Constructor("Steve Rogers");
		Constructor accountObj2 = new Constructor("Tony Stark");
		
		System.out.printf("accountObj1 name is : %s%n", accountObj1.getName());
		System.out.printf("accountObj2 name is : %s%n", accountObj2.getName());
		

	}

}
