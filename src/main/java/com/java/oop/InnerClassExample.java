package com.java.oop;

import java.util.Collections;

public class InnerClassExample {
	
	public class MemberInnerClass{
		
		int i = 0;
		
		public void set(int i) {
			this.i=i;
		}
		
		public int get() {
			return i;
		}
		
	}
	
	InnerClassExample(){
		
		class Method1{
			
			int x=100;
			
			public void set(int x) {
				this.x=x;
			}
			
			public void get() {
				System.out.println("Constructor Block "+x);
			}
			
		}
		Method1 obj = new Method1();
		obj.get();
		obj.set(120);
		obj.get();
		
	}
	
	
	{
		class Method1{
			
			public int x=60;
			
			public void set(int x) {
				this.x = x;
			}
			
			public void get() {
				System.out.println("Non Static Block "+x);
			}
			
		}
		Method1 obj = new Method1();
		obj.get();
		obj.set(80);
		obj.get();
		
	}
	
	static {
		
		class Method1{
			
			public int x=20;
			
			public void set(int x) {
				this.x = x;
			}
			
			public void get() {
				System.out.println("Static Block "+x);
			}
			
		}
		Method1 obj = new Method1();
		obj.get();
		obj.set(40);
		obj.get();
		
		
	}

	public static void contains() {
		
		class Method1{
			
			public int x=10;
			
			public void set(int x) {
				this.x = x;
			}
			
			public void get() {
				System.out.println("Method Block "+x);
			}
			
		}

		Method1 obj = new Method1();
		obj.get();
		obj.set(20);
		obj.get();
		
	}
	
	public SuperClass override() {
		
		class Method1 extends SuperClass{
			
			public void toBeOverride() {
				
				System.out.println("Local Inner Class implementation");
				
			}
				
		}
		
		return new Method1();
		
	}
	
	public static void main(String [] args) {
		
		InnerClassExample obj = new InnerClassExample();
		
		SuperClass object = obj.override();
		
		object.toBeOverride();
		
		contains();
		
	}
}