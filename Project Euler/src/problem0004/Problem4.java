package problem0004;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import language.Language;

public class Problem4
{
	public static int getSolution()
	{
		final int max_multiple = (int) Math.pow(10, 3) - 1;
		List<Integer> palindromes = new LinkedList<>();
		
		for(int i = max_multiple; i > max_multiple * 0.75; i--)
		{
			for(int j = max_multiple; j > max_multiple * 0.75; j--)
			{
				String test = Integer.toString(i * j);
				if(Language.isPalindrome(test))
				{
					palindromes.add(Integer.parseInt(test));
				}
			}
		}
		Collections.sort(palindromes);
		Collections.reverse(palindromes);
		return palindromes.get(0);
	}
}
