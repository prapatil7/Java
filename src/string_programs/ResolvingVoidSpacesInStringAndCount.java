package string_programs;

public class ResolvingVoidSpacesInStringAndCount {
	public static void main(String[] args) {
		String s= "P R A T I K";
		int count = 0;
		String s1= s.replace(" ", "");
		  System.out.println(s1);
		  char[] c= s.toCharArray();
		  for (char c1:c)
		  {
			  if (c1==' ')
			  {
				  count++;
			  }
		  }
		  System.out.println(count);
	}

}
