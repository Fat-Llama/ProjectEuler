package solutions;

import problem0001.Problem1;
import problem0002.Problem2;
import problem0003.Problem3;
import problem0004.Problem4;

public class Solutions
{	
	public static void main(String[] args)
	{
		System.out.println(Problem1.getSolution(3, 5, 1000));
		System.out.println(Problem2.getSolution(4000000));
		Thread problem3 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				System.out.println(Problem3.getSolution(600851475143L));
			}
		});
		problem3.start();
		System.out.println(Problem4.getSolution());
	}
}
