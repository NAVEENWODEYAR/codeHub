package com.stream;

import java.util.*;

public class StrmSortingOperations 
{
	// Sorting operations,
	// 1. sorted(Comparator) : Sorting according to supplied comparator
	static void naturalSorting(List<Laptop> set)
	{
//		set.stream().sequential().forEach(System.out::println);
		set.stream().sorted((l1,l2)->l1.getLapId()-l2.getLapId()).skip(2).forEach(System.out::println);
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
					naturalSorting(lapSet);
					System.out.println("\n************\n");
	}
}
