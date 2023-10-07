package com.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrmFindingMatchingOperations 
{
	// 1. anyMatch() : Any one element matches, Short-circuiting Terminal Operation.,
	static void anyMatchInColln(Set<Laptop> lap)
	{
		boolean anyMatch = lap.stream().anyMatch(lp->lp.getLapPrice()>100000);
		
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
					System.out.println("\n************\n");
					System.out.println("\n************\n");
					System.out.println("\n************\n");
	}
}
