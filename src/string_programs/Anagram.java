package string_programs;

import java.util.Arrays;

public class Anagram {
	
	// Anagram means by shuffling both the words the letters present in both string should be same irrespective of their order
	public static void main(String[] args) {
		String s1= "grab";
		String s2= "brag";
		
		char[] c1=s1.toCharArray();
		char[] c2 =s2.toCharArray();
		
		if (s1.length()==s2.length())
		{
			Arrays.sort(c1);
			Arrays.sort(c2);	
		}
		if (Arrays.equals(c1,c2))
		{
			System.out.println("Strings s1 and s2 are anagram");
		}
		else
		{
			System.out.println("Strings s1 and s2 are not anagram");
		}
		
	}

}
