package com.java.oop;

public class ParametrizedConstructor {

	private String name;
	private double balance;
	
	public ParametrizedConstructor(String name, double balance) {
		this.name = name;
		
		if(balance > 0.00)
			this.balance = balance;

	}
	
	public void deposit(double depositAmount) {
		
		if(depositAmount > 0.0)
			this.balance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		
		if(withdrawAmount > 0.0 && this.balance>=withdrawAmount)
				this.balance-=withdrawAmount;			

	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
}
