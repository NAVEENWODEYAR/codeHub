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
	public static void main(String[] args) 
	{
		getSum(new int[] {2,6,8,9,6,3,2});
	}
}
