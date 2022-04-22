package string_programs;

public class Add_Numbers_Present_in_String {
	
	public static void main(String[] args) {
		String s= "abcd45fg12r57";
		int sum =0;
		
		 
		 for (int i=0; i<=s.length()-1; i++)
		 {
			 char[] c= s.toCharArray();
			if (Character.isDigit(c[i]))
			{
			
				
				String s1 = String.valueOf(c[i]);
//				System.out.print(s1);
				
			  sum =sum +Integer.parseInt(s1);		  
			}
		 }
		 System.out.println();
		 System.out.println(sum);
	}

}
