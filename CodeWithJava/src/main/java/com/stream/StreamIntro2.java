
package com.stream;

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
	}
	
	public static void main(String[] args) 
	{
		emptyStream();
	}
}
