package com.test;

import java.util.*;

public class Student2Impl 
{

	public static void main(String[] args) 
	{
		Set<Student2> studentList = new TreeSet(new Comparator() 
																{
																	@Override
																	public int compare(Object o1, Object o2) 
																	{
																		return 0;
																	}});
	}

}
