package problem0001;

import java.util.List;
import java.util.Stack;

import math.Math;

public class Problem1
{
	public static int sumMultiplesOfXAndYInZ(int x, int y, int z)
	{
		int max_test_integer = z;
		int multiple_one = x;
		int multiple_two = y;
		
		List<Integer> multiples = new Stack<>();;
		for (int i = 1; i < max_test_integer; i++)
		{
			if (Math.isXMultipleOfY(multiple_one, i) || Math.isXMultipleOfY(multiple_two, i))
			{
				multiples.add(i);
			}
		}
		
		return Math.sumOfIntegers(multiples);
	}
}
