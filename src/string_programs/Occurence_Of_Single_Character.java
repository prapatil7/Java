package string_programs;

public class Occurence_Of_Single_Character {
	
	public static void main(String[] args) {
		
		String s= "abchadkasmfkabq";
		int count=0;
		
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)=='a')
			{
			count = count+1;
			}
		}
		System.out.println(count);
	}

}
