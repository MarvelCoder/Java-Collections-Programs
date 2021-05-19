package com.java.oop;
import java.util.Scanner;

public class ParametrizedConstructorTest {

	public static void main(String[] args) {

		ParametrizedConstructor myAccount1 = new ParametrizedConstructor("Steve Rogers", -12.00);
		ParametrizedConstructor myAccount2 = new ParametrizedConstructor("Tony Stark", 99999999.99);
		
		System.out.printf("Account balance for %s is %.2f%n", myAccount1.getName(), myAccount1.getBalance());
		System.out.printf("Account balance for %s is %.2f%n", myAccount2.getName(), myAccount2.getBalance());
		
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the withdraw amount - ");
		
		double withdrawAmount= input.nextDouble();
		
		myAccount1.withdraw(withdrawAmount);
		myAccount2.withdraw(withdrawAmount);
		
		System.out.println();
		
		System.out.printf("Account balance for %s is %.2f%n", myAccount1.getName(), myAccount1.getBalance());
		System.out.printf("Account balance for %s is %.2f%n", myAccount2.getName(), myAccount2.getBalance());

		System.out.println();
		
		System.out.print("Please enter the deposit amount - ");
		
		double depositAmount = input.nextDouble();
		
		myAccount1.deposit(depositAmount);
		myAccount2.deposit(depositAmount);
		
		System.out.println();

		System.out.printf("Account balance for %s is %.2f%n", myAccount1.getName(), myAccount1.getBalance());
		System.out.printf("Account balance for %s is %.2f%n", myAccount2.getName(), myAccount2.getBalance());

		
		input.close();
		
	}

}
