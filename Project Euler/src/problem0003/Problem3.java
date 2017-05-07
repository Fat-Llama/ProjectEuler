package problem0003;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import math.Math;

/**
 * Returns the largest prime number
 * that is a multiple of X.
 * 
 * @author Conno_000
 *
 */
public class Problem3
{
	public static Long getSolution(Long x)
	{
		for (Long i = 1L; i <= x / 2; i++)
		{
			if (Math.isMultiple(x, i))
			{
				long factor = x / i;
				if (Math.isPrimeNumber(factor))
				{
					return factor;
				}
			}
		}
		return null;
	}
	
	public static Long getSolutionV2(Long x)
	{
		List<Long> multiples = Math.getAllMultiples(x);
		multiples.removeIf(new Predicate<Long>()
		{

			@Override
			public boolean test(Long t)
			{
				if(Math.isPrimeNumber(t))return false;
				else return true;
			}
		});
		Collections.sort(multiples);
		Collections.reverse(multiples);
		return multiples.get(0);
	}
}
