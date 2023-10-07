package com.stream;

import java.util.*;

public class StrmOtherOperations 
{
	// 1. toArray() : Stream to array,
	static void collnToArray(List<Laptop> list)
	{
		Object[] array = list.stream().toArray();
		System.out.println(Arrays.toString(array));
	}
	
	// 2. peek() ,Stream<T> peek(Consumer<T> action)
	//  This method is only to support debugging where you want to see the elements as you pass in a pipeline.
	static void debugStream(List<Laptop> list)
	{
		
	}
	public static void main(String[] args) 
	{
		List<Laptop> lapSet = new ArrayList();
					lapSet.add(new Laptop(1,"X1Carbon","Lenovo",2017,198765));
					lapSet.add(new Laptop(15,"X1Carbon","Lenovo",2017,198765));
					lapSet.add(new Laptop(7,"Yoga","Lenovo",2019,98765));
					lapSet.add(new Laptop(9,"Vostro","Dell",2011,48765));
					lapSet.add(new Laptop(8,"ThinkPad","Lenovo",2023,98765));
					lapSet.add(new Laptop(17,"Air","Mac",2027,148765));
					
		// invoke the static methods,
					System.out.println("\n************\n");
					collnToArray(lapSet);
					System.out.println("\n************\n");
	}
}
