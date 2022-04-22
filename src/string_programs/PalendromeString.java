package string_programs;

import stringclass.CharAt;

public class PalendromeString {
	public static void main(String[] args) {
	    
		String s= "Radar";
		String s1="";
		
		for (int i =s.length()-1; i>=0; i--)
		{
			char c= s.charAt(i);
			s1=s1+c;
		}
		
		if (s.toLowerCase().equals(s1.toLowerCase()))
		{
			System.out.println("both the Strings are palidrome");
		}
		
	}
	
	//or
	
	
}
