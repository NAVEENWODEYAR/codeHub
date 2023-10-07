package com.stream;

import java.util.*;

public class StrmOtherOperations 
{
	// 1. toArray() : Stream to array,
	static void collnToArray(List list)
	{
		Object[] array = list.stream().toArray();
		System.out.println(Arrays.toString(array));
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
					System.out.println("\n************\n");
	}
}
