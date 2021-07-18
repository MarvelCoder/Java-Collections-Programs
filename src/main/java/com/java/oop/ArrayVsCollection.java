package com.java.oop;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsCollection {

	public static void main(String[] args) {
		
		int[] arr =new int[3];
		arr[0] = 4;
		arr[1] = 2;
		arr[2] = Integer.valueOf(3);
		
		System.out.println(arr);
		
		List list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add(1);
		list.add(0.5);
		
		int var = (int)list.get(2);
		
		System.out.println(var);
	}

}
