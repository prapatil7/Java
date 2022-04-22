package src.arrays;

public class Arrays_1 
{
	public static void main(String[] args) {
		
		 int [] a = new int[8];       // first method of making an array
			
			a[0] = 1;
			a[1] = 60;
			a[2] = 70;
			a[3] = 98;
			a[4] = 12;
			a[5] = 45;
			a[6] = 80;
			a[7] = 82;
			System.out.println(a[6]);
			for (int i=0; i<=7; i++)
			{
				System.out.println(a[i]);
			}	
	    System.out.println("---------------------------------------------------------------------");
	    
		String [] s=new String[4];
		s[0]="a";
		s[1]="b";
		s[2]="c";
		s[3]= "d";
		
	    for (int j=0; j<=s.length-1; j++)
	    {
	    	 System.out.println(s[j]);
	     }
			
	    System.out.println("---------------------------------------------------------------------");
	    
	    String [] s1= {"abc", "pqr", "def"};         // second method of making an array
	      int size = s1.length;
	      System.out.println(size);
	     
	    for (int x=0; x<=size-1; x++)
	    {
	       System.out.println(s1[x]);
	    }
	    
	    System.out.println("---------------------------------------------------------------------");
	    
	    
	    
	}}