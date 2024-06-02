package advanced_String_Assignment;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency
{
	public static Map<Character, Integer> charFrequency(String str) 
	{
		 HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		return map;
	}
	

}
