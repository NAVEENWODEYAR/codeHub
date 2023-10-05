package com.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StrmSelectionOperations 
{
	// filter() : Selecting with a predicate
	static void filterLap(Set<Laptop> s)
	{
				 s.stream().filter(lap -> lap.getLapPrice() >= 100000).forEach(System.out::println);
				
	}
	public static void main(String[] args) 
	{
		Set<Laptop> lapSet = new HashSet();
					lapSet.add(new Laptop(1,"X1Carbon","Lenovo",2017,198765));
					lapSet.add(new Laptop(7,"Yoga","Lenovo",2019,98765));
					lapSet.add(new Laptop(9,"Vostro","Dell",2011,48765));
					lapSet.add(new Laptop(8,"ThinkPad","Lenovo",2023,98765));
					lapSet.add(new Laptop(17,"Air","Mac",2027,148765));
					
		// invoke the static methods,
					filterLap(lapSet);
	}
}
