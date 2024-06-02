package advanced_String_Assignment;

import java.util.ArrayList;
import java.util.List;

public class PermutationsString 
{
	public static List<String> findPermutations(String str) 
	{
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) 
        {
            return result;
        }
        generatePermutations(str, "", result);
        return result;
    }

    private static void generatePermutations(String str, String prefix, List<String> result) 
    {
        if (str.length() == 0) 
        {
            result.add(prefix);
        }
        else 
        {
            for (int i = 0; i < str.length(); i++)
            {
                char currentChar = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + currentChar, result);
            }
        }
    }

}
