package string_programs;

public class AddIntegersPresintInString {
	public static void main(String[] args) {
	
	String s= "10abc8def20pqr";
	int sum=0;
	String s1="";
	char[] c=s.toCharArray();
	for (char c1:c)
	{
	if (Character.isDigit(c1))
	{
	   s1=s1+c1;
	}
	else if (!(s1.equals("")))
	{
		sum = sum+Integer.parseInt(s1);
		s1="";
	}
	}
	System.out.println(sum);
	}
}
