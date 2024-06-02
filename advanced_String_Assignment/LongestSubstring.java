package advanced_String_Assignment;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring 
{

	public static String longestUniqueSubstring(String str)
	{
		 if (str == null || str.length() == 0)
		 {
	            return "";
	     }

	        Map<Character, Integer> charIndexMap = new HashMap<>();
	        int maxLength = 0;
	        int start = 0;
	        int maxStart = 0;

	        for (int end = 0; end < str.length(); end++) 
	        {
	            char currentChar = str.charAt(end);

	            if (charIndexMap.containsKey(currentChar))
	            {
	                start = Math.max(start, charIndexMap.get(currentChar) + 1);
	            }

	            charIndexMap.put(currentChar, end);

	            if (end - start + 1 > maxLength) 
	            {
	                maxLength = end - start + 1;
	                maxStart = start;
	            }
	        }
	        return str.substring(maxStart, maxStart + maxLength);
	}

}
