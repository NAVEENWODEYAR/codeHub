package com.test;

import java.util.*;

public class Student2Impl 
{

	public static void main(String[] args) 
	{
		Set<Student2> studentList = new TreeSet<Student2>(new Comparator() 
																{
																	@Override
																	public int compare(Object o1, Object o2) 
																	{
																		return o1.hashCode() - o2.hashCode();
																	}});
					studentList.add(null);
					System.out.println(studentList);
	
	
	}

}
