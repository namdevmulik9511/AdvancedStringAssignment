package advanced_String_Assignment;

public class RemoveDuplicates
{

	public static String removeDupli(String str)
	{ 
		char ch[]=str.toCharArray();
		String remove="";
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				remove=remove+ch[i];
			}
		}
		return remove;
	}

}
