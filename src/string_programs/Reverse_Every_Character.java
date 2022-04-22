package string_programs;

public class Reverse_Every_Character {
   public static void main(String[] args) {
	
	   String s1="India is my country";
	  char[] c = s1.toCharArray();
	 System.out.println(c.length);

	 for (char c1 : c)
	 {
		 
	 }
	 
	   String s="";
	        String[] s2= s1.split(" ");
	          
	  for (int i=0; i<s2.length; i++)
	  {
		  String s3= s2[i];
		  String s4= "";
		for (int j=s3.length()-1; j>=0; j--)
		{
			s4= s4+s3.charAt(j);
		}  
		s=s+s4+" ";
	  }
	  System.out.println(s);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
