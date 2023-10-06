package com.stream;

import java.util.*;

public class StrmReducingOperations 
{
	// reducing operations,
	// 1. reduce() : Produces a single value
	static void getSum(int[] nums)
	{
		List<int[]> list = Arrays.asList(nums);
		list.forEach(System.out::println);
	}
	public static void main(String[] args) 
	{
		getSum(new int[] {2,6,8,9,6,3,2});
	}
}
