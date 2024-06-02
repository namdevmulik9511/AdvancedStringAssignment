package advanced_String_Assignment;

public class StringCompressor {

	public static String compressString(String str) 
	{
		if (str == null || str.length() == 0)
		{
			return str;
		}

		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			countConsecutive++;

			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) 
			{
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
}
