package advanced_String_Assignment;

import java.util.List;
import java.util.Map;

public class String_Assignment 
{
	public static void main(String[] args) 
	{
		//CharacterFrequency
		String str="aabbbccccdddddd";
		Map<Character,Integer> map=CharacterFrequency.charFrequency(str);
		for(Map.Entry<Character, Integer> ch:map.entrySet())
		{
			System.out.println(ch.getKey()+" "+ch.getValue());
		}
		System.out.println();
		
		//Palindrome String
		String palindrome="aba";
		boolean pali=IsPalindromeString.palindrome(palindrome);
		if(pali)
		{
			System.out.println(palindrome+" String is Palindrome");
		}
		else
		{
			System.out.println(palindrome+" String is not palindrome");
		}
		System.out.println();

		//Anagram String 
		
		String str1="listen", str2="silent";
		boolean ana=AnagramString.isStringAnagram(str1,str2);
		if(ana)
		{
			System.out.println(str1+" and "+str2+" String is anagram");
		}
		else
		{
			System.out.println(str1+" and "+str2+" String is not anagram");
		}
		System.out.println();

		//Longest Substring Without Repeating Characters
		String subString = "abcdefgabef";
		String sub=LongestSubstring.longestUniqueSubstring(subString);
		System.out.println(sub);
		
		System.out.println();

		//StringCompressor
		String sCompressor=//"aabcccccaaa";
				"abbcccddddee";
		String compressor=StringCompressor.compressString(sCompressor);
		System.out.println("StringCompressor is :"+compressor);

		System.out.println();

		//Find All Permutations of a String
		String permutations="abc";
		List<String> list=PermutationsString.findPermutations(permutations);
		System.out.println("Permutations String : "+list);
		
		System.out.println();

		//Remove Duplicates
		String remove="abcabc";
		String result=RemoveDuplicates.removeDupli(remove);
		System.out.println("Remove Duplicates String :- "+result);

		System.out.println();

		//Reverse Words in a String
		String words="Hello World";
		String reverse=ReverseWords.reverseWordsString(words);
		System.out.println("Reverse Words String : "+reverse);
	}

}
