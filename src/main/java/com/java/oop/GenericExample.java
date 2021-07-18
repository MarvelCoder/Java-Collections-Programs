package com.java.oop;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {	
		System.out.println(genericMethod("Apple", "Banana"));
		System.out.println(genericMethod(150, 100.25));
		genericMethod(new Student(),new Student());
	}

	public static List<String> listMethod(String s1,String s2){
		List<String> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		
		return list;
	}
	
	public static <T> List<T> genericMethod(T s1, T s2){	
		List<T> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		
		return list;
		
	}
}

class Student{
	
}