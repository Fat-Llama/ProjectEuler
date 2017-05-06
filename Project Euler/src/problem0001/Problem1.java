package problem0001;

import java.util.List;
import java.util.Stack;

import math.Math;

/**
 * Collects X and Y multiples of a number Z.
 * For example multiples of 3(X) in 1000(Y) as
 * well as multiples of 5(5) in 1000(Y) are collected.
 * 
 * The multiples are then summed and returned to the user.
 * 
 * @author Conno_000
 *
 */
public class Problem1
{
	public static int getSolution(int x, int y, int z)
	{
		List<Integer> divisors = new Stack<>();
		divisors.add(x);
		divisors.add(y);
		
		List<Integer> multiples = Math.getMultiples(divisors, z);
		
		return Math.sumOfIntegers(multiples);
	}
}
