package com.stream;

import java.util.*;

public class StrmReducingOperations 
{
	// reducing operations,
	// 1. reduce() : Produces a single value
	static void getSum(int[] nums)
	{
//		int sum = Arrays.stream(nums).reduce(0,(a,b)->a+b);
		OptionalInt sum = Arrays.stream(nums).reduce((a,b)-> a+b);
		System.out.println(sum.getAsInt());
	}
	
	// 2. min()&max() : Finding the minimum & maximum in the collection using stream.
	static void minimumValue(int[] num)
	{
		int min = Arrays.stream(num).min().getAsInt();
		double avg = Arrays.stream(num).average().getAsDouble();
		int max = Arrays.stream(num).max().getAsInt();
		System.out.println("\nMinimum value->"+min+"\nAverage value->"+avg+"\nMaximum value->"+max);
	}
	public static void main(String[] args) 
	{
		getSum(new int[] {2,6,8,9,6,3,2});
		minimumValue(new int[] {9,8,7,6,5,4,3,2});
	}
}
