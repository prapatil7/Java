package string_programs;

public class Number_Of_Occurence_Of_Character {

	public static void main(String[] args) {
	String s="aabdjaajfksvandj";
	char[] c=s.toCharArray();
//
//	for (int i=0; i<s.length(); i++)
//	{
//		int count = 0;
//
//		for (int j=0; i<s.length(); j++)
//		{
//			if (j<i && c[i]==c[j])
//			{
//				break;
//			}
//			 if (c[i]==c[j])
//		     {
//				count++;
//			 }
//			if (j==s.length()-1)
//			{
//			System.out.println("number of occerence of " +c[i]+" are "+count);
//			}
//		}
//		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				
				if(j<i && c[i]==c[j])
				{
					break;
				}
				if(c[i]==c[j])
				{
					count++;
				}
				if(j==s.length()-1)
				{
					System.out.println("charecter  "+c[i]+" repetead "+count+" times");
				}
				
			}
	}
}
}
