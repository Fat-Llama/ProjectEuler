package problem0003;

import java.util.List;
import java.util.Stack;

public class Math
{
	public static boolean isXMultipleOfY(int x, int y)
	{
		if(y % x != 0) return false;
		else return true;
	}
	
	public static boolean isXMultipleOfY(long x, long y)
	{
		if(y % x == 0) return true;
		else return false;
	}
	
	public static boolean isPrimeNumber(int x)
	{
		for(int i = 2; i <= x/2 ; i++)
		{
			if(Math.isXMultipleOfY(i, x)) return false;
		}
		return true;
	}
	
	public static boolean isPrimeNumber(long x)
	{
		for(long i = 2; i <= x/2 ; i++)
		{
			if(Math.isXMultipleOfY(i, x)) return false;
		}
		return true;
	}
	
	public static int sumOfIntegers(List<Integer> integers)
	{
		int total = 0;
		for(int i: integers)
		{
			total += i;
		}
		return total;
	}
	
	public static long sumOfLongs(List<Long> integers)
	{
		long total = 0;
		for(long i: integers)
		{
			total += i;
		}
		return total;
	}
	
	public static boolean isXEven(int x)
	{
		return Math.isXMultipleOfY(2, x);
	}
	
	public static boolean isXEven(long x)
	{
		return Math.isXMultipleOfY(2, x);
	}
	
	public static List<Integer> fibonacciToIntegerX(int x)
	{
		List<Integer> fibonacciSequence = new Stack<>();
		int lastInteger = 1;
		int valueHolder = 1;
		int currentInteger = 1;
		while(currentInteger < x)
		{
			fibonacciSequence.add(currentInteger);
			valueHolder = currentInteger;
			currentInteger = lastInteger + currentInteger;
			lastInteger = valueHolder;
		}
		return fibonacciSequence;
	}
	
	public static List<Long> fibonacciToLongX(long x)
	{
		List<Long> fibonacciSequence = new Stack<>();
		long lastLong = 1;
		long valueHolder = 1;
		long currentLong = 1;
		while(currentLong < x)
		{
			fibonacciSequence.add(currentLong);
			valueHolder = currentLong;
			currentLong = lastLong + currentLong;
			lastLong = valueHolder;
		}
		return fibonacciSequence;
	}
}
