package com.stream;

import java.util.*;

public class StrmReducingOperations 
{
	// reducing operations,
	// 1. reduce() : Produces a single value
	static void getSum(int[] nums)
	{
		int[] is = Arrays.asList(nums).stream().max((o1, o2) ->o1-o2).get();
	}
	public static void main(String[] args) 
	{
		
	}
}
