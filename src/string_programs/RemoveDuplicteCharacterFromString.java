package string_programs;

public class RemoveDuplicteCharacterFromString {
 public static void main(String[] args) {
	String s="aadfhhjpkdaakd";
	String s2="";
	
	for(int i=0; i<s.length(); i++)
	{
	     int count=0;
		for (int j=0; j<=i; j++)
		{
			if (s.charAt(i)==s2.charAt(j))
			{
				count++;
			}
		}
		System.out.println(count);
	}
			
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}