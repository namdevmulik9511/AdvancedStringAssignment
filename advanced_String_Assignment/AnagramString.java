package advanced_String_Assignment;

import java.util.Arrays;

public class AnagramString
{

	public static boolean isStringAnagram(String str1, String str2) 
	{
		char ch1 []=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length)
		{
			return false;
		}
		for(int i=0;i<ch1.length && i<ch2.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
			
		}
		return true;
	}

}
