package com.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StrmMappingOperations 
{
	// 1. filter() : Selecting with a predicate
	static void filterLap(Set<Laptop> s)
	{
				 s.stream().filter(lap -> lap.getLapPrice() >= 100000).forEach(System.out::println);
				
	}
	
	// 2. selecting only unique values, distinct(),
	static void uniqueValues(Set<Laptop> set)
	{
		set.parallelStream().distinct().forEachOrdered(System.out::println);
	}
	
	// 3. limiting first n elements,limit() and skip().,
	static void limitElements(Set<Laptop> set)
	{
		set.parallelStream().skip(1).limit(4).forEach(System.out::println);
	}
	
	public static void main(String[] args) 
	{
		Set<Laptop> lapSet = new HashSet();
					lapSet.add(new Laptop(1,"X1Carbon","Lenovo",2017,198765));
					lapSet.add(new Laptop(15,"X1Carbon","Lenovo",2017,198765));
					lapSet.add(new Laptop(7,"Yoga","Lenovo",2019,98765));
					lapSet.add(new Laptop(9,"Vostro","Dell",2011,48765));
					lapSet.add(new Laptop(8,"ThinkPad","Lenovo",2023,98765));
					lapSet.add(new Laptop(17,"Air","Mac",2027,148765));
					
		// invoke the static methods,
					filterLap(lapSet);
					System.out.println("\n************\n");
					uniqueValues(lapSet);
					System.out.println("\n************\n");
					limitElements(lapSet);
					System.out.println("\n************\n");
	}
}
