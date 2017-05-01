package problem0002;

import java.util.List;
import java.util.function.Predicate;
import math.Math;

public class Problem2
{
	public static int sumEvenFibonacciSequence(int maxValue)
	{
		int doNotExceed = maxValue;
		int sum = 0;
		
		List<Integer> fibonacciSequence = Math.fibonacciToIntegerX(doNotExceed);
		Predicate<Integer> predicate = new Predicate<Integer>()
		{
			@Override
			public boolean test(Integer t)
			{
				return !Math.isXEven(t);
			}
		};
		fibonacciSequence.removeIf(predicate);
		sum = Math.sumOfIntegers(fibonacciSequence);
		return sum;
	}
}
