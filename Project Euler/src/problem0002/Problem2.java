package problem0002;

import java.util.List;
import java.util.function.Predicate;
import math.Math;

/**
 * Generates the Fibonacci sequence up to
 * a maximum integer max_value.
 * Then said sequence is reduced to the even numbers only.
 * Finally the sum of the sequence is returned to the user.
 * 
 * @author Conno_000
 *
 */
public class Problem2
{
	public static int getSolution(int max_value)
	{
		List<Integer> fibonacci_sequence = Math.fibonacciTo(max_value);
		Predicate<Integer> predicate = new Predicate<Integer>()
		{
			@Override
			public boolean test(Integer t)
			{
				return !Math.isEven(t);
			}
		};
		fibonacci_sequence.removeIf(predicate);
		return Math.sumOfIntegers(fibonacci_sequence);
	}
}
