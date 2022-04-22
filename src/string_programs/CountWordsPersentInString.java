package string_programs;

import stringclass.CharAt;

public class CountWordsPersentInString {
	public static void main(String[] args) {
		String emailid= "pratikpatil07may@gmail.com";
		
		char[] c=emailid.toCharArray();
		for (int i=0; i<=emailid.length()-1; i++)
		{
		  
		   int index= emailid.indexOf(c[i]);
             
		  if (index%2==0)
		  {
			  String s1= emailid.replaceAll("[a-z]",  "*");
			  System.out.println(s1);
		  }

		}
	
	
	String s= "abcdefgh";
	   
	    for(int i=0; i<=s.length()-1; i++)
	    {
	    	char c4=s.charAt(i);
	    	int j=s.indexOf(c4);
	    	if (j%2==0)
	    	{
	    		String s2=s.replaceAll("[a-z]", "*");
	    		System.out.println(s2);
	    	}
//	    	else if (j!%2==0)
{
//	
}
	    
	    	
	    }
	}
}
