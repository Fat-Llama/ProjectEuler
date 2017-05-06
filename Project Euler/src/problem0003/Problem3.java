package problem0003;

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
				if(Math.isPrimeNumber(factor))
				{
					return factor;
				}
			}
		}
		return null;
	}
}
