package problem0003;

public class Problem3
{
	
	public static void main(String[] args)
	{
		Long test_number = 600851475143L;
		
		for (Long i = 1L; i <= test_number / 2; i++)
		{
			if (Math.isXMultipleOfY(i, test_number))
			{
				long factor = test_number / i;
				if(Math.isPrimeNumber(factor))
				{
					System.out.println(factor);
					break;
				}
			}
		}
	}
}
