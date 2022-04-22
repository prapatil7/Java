package string_programs;

public class Count_Duplicate_Character {
	 public static void main(String[] args) {
	    String s="abhdfajhfjgabdbaba";
	    int count=0;
	    
	    for (int i=0; i<=s.length()-1; i++)
	    {
	    	
	        if (s.charAt(i)=='b')
	        {
	        	count++;
	        }
	   
	    }
	    System.out.println(count);
	 
}
}