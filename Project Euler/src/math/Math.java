package math;

import java.util.List;
import java.util.Stack;

public class Math
{
	/**
	 * Checks if x is a multiple of y.
	 * 
	 * @param x
	 *            the divisor.
	 * @param y
	 *            the dividend.
	 * @return true if x is a multiple of y.
	 */
	public static boolean isMultiple(int x, int y)
	{
		if (x % y != 0)
			return false;
		else
			return true;
	}
	
	/**
	 * Checks if x is a multiple of y.
	 * 
	 * @param x
	 *            the divisor.
	 * @param y
	 *            the dividend.
	 * @return true if x is a multiple of y.
	 */
	public static boolean isMultiple(long x, long y)
	{
		if (x % y == 0)
			return true;
		else
			return false;
	}
	
	public static List<Integer> getMultiples(List<Integer> divisors, int x)
	{
		List<Integer> multiples = new Stack<>();
		for (int i = 1; i < x; i++)
		{
			for (int divisor : divisors)
			{
				if (Math.isMultiple(i, divisor))
				{
					multiples.add(i);
					break;
				}
			}
		}
		return multiples;
	}
	
	public static boolean isPrimeNumber(int x)
	{
		if (x < 1)
			return false;
		if (x == 1)
			return true;
		for (int i = 2; i <= x / 2; i++)
		{
			if (Math.isMultiple(x, i))
				return false;
		}
		return true;
	}
	
	public static boolean isPrimeNumber(long x)
	{
		if (x < 1)
			return false;
		if (x == 1)
			return true;
		for (int i = 2; i <= x / 2; i++)
		{
			if (Math.isMultiple(x, i))
				return false;
		}
		return true;
	}
	
	public static int sumOfIntegers(List<Integer> integers)
	{
		int total = 0;
		for (int i : integers)
		{
			total += i;
		}
		return total;
	}
	
	public static long sumOfLongs(List<Long> longs)
	{
		long total = 0;
		for (long i : longs)
		{
			total += i;
		}
		return total;
	}
	
	public static boolean isEven(int x)
	{
		return Math.isMultiple(x, 2);
	}
	
	public static boolean isEven(long x)
	{
		return Math.isMultiple(x, 2);
	}
	
	public static List<Integer> fibonacciTo(int x)
	{
		List<Integer> fibonacciSequence = new Stack<>();
		int lastInteger = 1;
		int valueHolder = 1;
		int currentInteger = 1;
		while (currentInteger < x)
		{
			fibonacciSequence.add(currentInteger);
			valueHolder = currentInteger;
			currentInteger = lastInteger + currentInteger;
			lastInteger = valueHolder;
		}
		return fibonacciSequence;
	}
	
	public static List<Long> fibonacciTo(long x)
	{
		List<Long> fibonacciSequence = new Stack<>();
		long lastLong = 1;
		long valueHolder = 1;
		long currentLong = 1;
		while (currentLong < x)
		{
			fibonacciSequence.add(currentLong);
			valueHolder = currentLong;
			currentLong = lastLong + currentLong;
			lastLong = valueHolder;
		}
		return fibonacciSequence;
	}
}
