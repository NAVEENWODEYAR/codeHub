package com.java8;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrFrequ
{
	static void strFrequency(String st)
	{
		Stream.of(st.toLowerCase().split(""))
				.collect(Collectors.groupingBy(s->s,Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Entry.comparingByKey())
				.forEach(System.out::print);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("\nProgram to find the frequency of given string using streamAPI & Java 8\n");
		strFrequency("Collectors.groupingBy");
	}

}
