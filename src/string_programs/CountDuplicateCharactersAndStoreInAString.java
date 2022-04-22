package string_programs;

import stringclass.CharAt;

public class CountDuplicateCharactersAndStoreInAString {
	public static void main(String[] args) {
		String s1= "aabbccdgfhfijiiuyut";
		String s2="";
		for (int i=0; i<s1.length(); i++)
		{ 
			 int count =0;
			for (int j=0; j<i; j++)
			{
				if (s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
				if (count>1)
				{
					break;
				}
			}	
		  if (count==1)
		  {
			  s2=s2+s1.charAt(i);  
		  }
		}
		System.out.println(s2);
	
		
	}
}


