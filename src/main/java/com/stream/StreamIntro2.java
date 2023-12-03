
package com.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamIntro2
{
	// 1.empty() : Creates an empty stream
	static Stream emptyStream()
	{
		Stream<Laptop> lapStrm = Stream.empty();
		System.out.println(lapStrm);
		return lapStrm;
	}
	
	// 2. of(T t) : Creates a stream of single element of type T
	static void createStrm()
	{
		Stream<Laptop> lapStream = Stream.of(new Laptop(1,"X1Carbon","Lenovo",2017,198765));
		System.out.println(lapStream);
	}
	
	// 3. of(T… values) : Creates a stream from values
		static void createStrms()
		{
			Stream<Laptop> lapStream = Stream.of(new Laptop(1,"X1Carbon","Lenovo",2017,198765),
													new Laptop(7,"Yoga","Lenovo",2019,98765),
													new Laptop(9,"Vostro","Dell",2011,48765),
													new Laptop(8,"ThinkPad","Lenovo",2023,98765),
													new Laptop(17,"Air","Mac",2027,148765));
							lapStream.forEach(System.out::println);
		}
		
	// 4. Creating streams from collections,
		static void createFromColln()
		{
			List<Integer> intList = List.of(1,6,8,9,4,3,2);
			Stream<Integer> strmList = intList.stream();
							System.out.println(strmList.count());
		}
	
	public static void main(String[] args) 
	{
		emptyStream();
		createStrm();
		createStrms();
		createFromColln();
	}
}
