package stringclass;

public class IndexOf {
	public static void main(String[] args) {
		String s="yahoo";
		   int a = s.indexOf("h");
		   System.out.println(a);
		   for (int i=0; i<s.length(); i++)
		   {
			   char c=s.charAt(i);
			   int d=s.indexOf(c);
			   System.out.println(d);
			   
		   }
		   
	}

}
