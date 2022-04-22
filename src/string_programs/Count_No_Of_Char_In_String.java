package string_programs;

public class Count_No_Of_Char_In_String {
	public static void main(String[] args) {
		String s= "rsg6487857hnyjf";
		int count=0;
		
		char[] c=s.toCharArray();
		for (int i=0; i<=s.length()-1; i++)
		{
			if (Character.isAlphabetic(c[i]))
			{
				count++;
			}
		}
		   System.out.println("The number of character present String are " +count);
	}

}
