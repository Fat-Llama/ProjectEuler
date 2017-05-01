package problem0003;

import math.Math;

public class Problem3
{
	
	public static Long getLargestPrimMultipleOfX(Long x)
	{
		Long test_number = x;
		
		for (Long i = 1L; i <= test_number / 2; i++)
		{
			if (Math.isXMultipleOfY(i, test_number))
			{
				long factor = test_number / i;
				if(Math.isPrimeNumber(factor))
				{
					return factor;
				}
			}
		}
		return null;
	}
}
