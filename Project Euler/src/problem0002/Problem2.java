package problem0002;

import java.util.List;
import java.util.function.Predicate;

public class Problem2
{
	
	public static void main(String[] args)
	{
		int doNotExceed = 4000000;
		int sum = 0;
		
		List<Integer> fibonacciSequence = Math.fibonacciToX(doNotExceed);
		Predicate<Integer> predicate = new Predicate<Integer>()
		{
			
			@Override
			public boolean test(Integer t)
			{
				return !Math.isXEven(t);
			}
		};
		fibonacciSequence.removeIf(predicate);
		sum = Math.sumOf(fibonacciSequence);
		System.out.println(sum);
	}
}
