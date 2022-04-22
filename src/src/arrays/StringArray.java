package src.arrays;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
	   
		String[] s=new String[5];
		for (int i=0; i<s.length; i++)
		{
			Arrays.fill(s, "A");
			System.out.println(s[i]);
		}
	}

}
