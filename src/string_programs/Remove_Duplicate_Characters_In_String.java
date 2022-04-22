package string_programs;

public class Remove_Duplicate_Characters_In_String {
	public static void main(String[] args) {
		String s= "abcbacsaajshu";
		String s1="";
		char [] c =s.toCharArray();
		for (int i=0; i<s.length(); i++)
		{
			for (int j=0; j<s.length(); j++)
			{
				if (j<i && c[i]!=c[j])
				{
					break;
				}
				if (!(c[i]==c[j]))
				{
					s1=s1+c[j];
				}
			}
			System.out.println(s1);

		}		
	}
}
