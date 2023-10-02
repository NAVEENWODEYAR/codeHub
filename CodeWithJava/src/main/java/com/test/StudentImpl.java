package com.test;

import java.util.*;
import java.util.stream.*;

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
						studentList.add(new Student(5, "Nandi", "Pacharlahalli"));
						studentList.add(new Student(10, "Gowri", "Bangalore"));
						studentList.add(new Student(16, "Tulasi", "Bangalore"));
						studentList.add(new Student(16, "Tulasi", "Bangalore"));
						studentList.add(new Student(20, "Amar", "Adyar"));
						studentList.add(new Student(7, "Lakshmi", "Kolar"));
						
						
						// print the city with students count,
						Map<String, Long> stList = studentList.stream().collect(Collectors.groupingBy(Student::getStCity,Collectors.counting()));
						System.out.println(stList);
						
						
						// TreeMap doesn't have null key and keys are sorted.(natural sorting order)
						System.out.println("\n*****Natural Sorting Order*******");
						Map<String, Long> sortedList = new TreeMap<>(stList);
						System.out.println(sortedList);
						
						// TreeMap doesn't have null key and keys are sorted.(natural sorting order)
						System.out.println("\n*****Reverse Sorting Order*******");
						Map<String, Long> revList = new TreeMap<>(Collections.reverseOrder());
											revList.putAll(stList);
						System.out.println(revList);
						
						// LinkedHashmap maintains insertion order,
						System.out.println("\n*****Insertion  Order*******");
						Map<String, Long> linkedLst = new LinkedHashMap<>();
											linkedLst.putAll(stList);
						System.out.println(linkedLst);
						
	}
}
