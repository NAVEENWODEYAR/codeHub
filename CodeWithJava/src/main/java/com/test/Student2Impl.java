package com.test;

import java.util.*;

public class Student2Impl 
{

	public static void main(String[] args) 
	{
		Set<Student2> studentList2 = new HashSet<>();
					studentList2.add(new Student2(1,"Kevin","Clara",27,"Abudabi"));
					studentList2.add(new Student2(10,"Jones","Thomas",27,"Berlin"));
					studentList2.add(new Student2(4,"Madam","Dora",87,"Kolar"));
					System.out.println(studentList2);
	
	
	}

}
