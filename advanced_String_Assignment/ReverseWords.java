package advanced_String_Assignment;

public class ReverseWords
{

	public static String reverseWordsString(String str)
	{
		String st[]=str.split(" ");
		String reverse="";
		for(int i=st.length-1;i>=0;i--)
		{
			reverse=reverse+st[i];
			reverse=reverse+" ";
		}
		return reverse;
	}

}
