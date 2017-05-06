package language;

public class Language
{
	public static boolean isPalindrome(String string)
	{
		int string_length = string.length();
		int counter = string.length() / 2;
		char before_middle = 0;
		char after_middle = 0;
		
		for (int i = 0; i < counter; i++)
		{
			before_middle = string.charAt(i);
			after_middle = string.charAt(string_length - i - 1);
			if (before_middle != after_middle)
			{
				return false;
			}
		}
		return true;
	}
}
