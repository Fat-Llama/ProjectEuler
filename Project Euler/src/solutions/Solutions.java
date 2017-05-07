package solutions;

import problem0001.Problem1;
import problem0002.Problem2;
import problem0003.Problem3;
import problem0004.Problem4;

public class Solutions
{
	public static void main(String[] args)
	{
		//1
		printSolution(1, Problem1.getSolution(3, 5, 1000));
		//2
		printSolution(2, Problem2.getSolution(4000000));
		//3
		Thread problem3 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				Long startTime = System.nanoTime();
				printSolution(3, Problem3.getSolution(600851475143L));
				Long endTime = System.nanoTime();
				System.out.println("Runtime: " + ((endTime - startTime) * 10E-10));
			}
		});
		//3.2
		Thread problem3v2 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				Long startTime = System.nanoTime();
				printSolution(3, Problem3.getSolutionV2(600851475143L));
				Long endTime = System.nanoTime();
				System.out.println("Runtime: " + ((endTime - startTime) * 10E-10));
			}
		});
		problem3.start();
		problem3v2.start();
		//4
		printSolution(4, Problem4.getSolution());
		//5
		
	}
	
	public static void printSolution(int problemNumber, int solution)
	{
		System.out.println("Problem " + problemNumber + ": " + solution);
		System.out.println();
	}
	
	public static void printSolution(int problemNumber, long solution)
	{
		System.out.println("Problem " + problemNumber + ": " + solution);
		System.out.println();
	}
}
