package problem0001;


public class Problem1
{
	
	public static void main(String[] args)
	{
		int maxTestInteger = 1000;
		
		int[] multiples = new int[maxTestInteger];
		for(int i = 0; i < maxTestInteger; i++)
		{
			if(Math.isXMultipleY(i, 3) || Math.isXMultipleY(i, 5))
			{
				multiples[i] = i;
			}
			else
			{
				multiples[i] = 0;
			}
		}
		
		System.out.println(Math.sumOf(multiples));
	}
	
}
