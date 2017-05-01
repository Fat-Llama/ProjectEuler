package problem0002;

import java.util.List;
import java.util.Stack;

public class Math
{
	public static boolean isXMultipleY(int x, int y)
	{
		if(x % y != 0) return false;
		else return true;
	}
	
	public static int sumOf(List<Integer> integers)
	{
		int total = 0;
		for(int i: integers)
		{
			total += i;
		}
		return total;
	}
	
	public static boolean isXEven(int x)
	{
		return Math.isXMultipleY(x, 2);
	}
	
	public static List<Integer> fibonacciToX(int x)
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
}
