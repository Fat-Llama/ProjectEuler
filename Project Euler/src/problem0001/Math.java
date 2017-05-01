package problem0001;

public class Math
{
	public static boolean isXMultipleY(int x, int y)
	{
		if(x % y != 0) return false;
		else return true;
	}
	
	public static int sumOf(int[] integers)
	{
		int total = 0;
		for(int i: integers)
		{
			total += i;
		}
		return total;
	}
}
