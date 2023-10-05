
package com.stream;

import java.util.stream.Stream;

public class StreamIntro2
{
	// create an empty stream,
	static Stream emptyStream()
	{
		Stream<Laptop> lapStrm = Stream.empty();
		System.out.println(lapStrm);
		return lapStrm;
	}
	
	public static void main(String[] args) 
	{
		emptyStream();
	}
}
