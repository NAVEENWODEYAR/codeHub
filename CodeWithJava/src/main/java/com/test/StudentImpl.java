package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StudentImpl 
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
						
						
						// TreeMap doesn't have null key and keys are sorted.(natural sorting order)
						System.out.println("*****Natural Sorting Order*******");
						Map<String, Long> sortedList = new TreeMap<>(stList);
						System.out.println(sortedList);
						
						// TreeMap doesn't have null key and keys are sorted.(natural sorting order)
						System.out.println("*****Reverse Sorting Order*******");
						Map<String, Long> revList = new TreeMap<>(Collections.reverseOrder());
											revList.putAll(stList);
						System.out.println(revList);

	}

}
