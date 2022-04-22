package string_programs;

import java.util.Arrays;

public class ArraySorting {
	// descending order 
	public static void main(String[] args) {
		
	
	String[] s = {"pratik", "shivam", "omkar", "prabha", "harsh"};
	Arrays.sort(s);
	
	for (int i=s.length-1; i>=0; i--)
	{
		System.out.println(s[i]);
	}
	}
}
