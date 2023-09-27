package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class StudentImpl2 
{

	public static void main(String[] args) 
	{
		List<Student> studentList = new ArrayList<>(10);
						studentList.add(new Student(1, "Vasu", "Punganuru"));
						studentList.add(new Student(2, "Vamsi", "Kadapa"));
						studentList.add(new Student(3, "Siva", "Nellore"));
						studentList.add(new Student(4, "Bhas", "Kolar"));
						studentList.add(new Student(5, "Gani", "Guntur"));
						studentList.add(new Student(10, "Gowri", "Bangalore"));
						studentList.add(new Student(16, "Tulasi", "Bangalore"));
						studentList.add(new Student(20, "Amar", "Adyar"));
						studentList.add(new Student(7, "Lakshmi", "Kolar"));
						
						
						// print the city with students count,
						Map<String, Long> stList = studentList.stream().collect(Collectors.groupingBy(Student::getStCity,Collectors.counting()));
						System.out.println(stList);
						
						
						// Sort the HashMap by keys, using the customized Comparator,( with strings as keys is sorted in increasing order of length of keys by passing customized)
						Map<String, Long> stList1 = new TreeMap<>(new Comparator<String>() 
						{
							@Override
							public int compare(String s1, String s2)
							{
								return s1.length() - s2.length();
							}
						});
						
						// using the Comparator,
						Map<String, Long> stList2 = studentList.stream().collect(Collectors.groupingBy(Student::getStCity,Collectors.counting()));
						System.out.println(stList2);
						

	}

}
