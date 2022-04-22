package src.logicalprogram;

public class StarPatterns5
{
//	     **
//	   **
//	 **
//	**
//	**
//	 **
//	   **
//	     **
	
	
	
	public static void main(String[] args) 
	{
	   int star=2;
	   int space=3;
	   
	   for (int a=1; a<=4; a++)
	   {
		   for(int b=1; b<=space; b++)
		   {
			   System.out.print(" ");
		   }
		   for(int c=1; c<=star; c++)
		   {
			   System.out.print("*");
		   }
		    System.out.println();
		    
		    space--;
		
	   }
	
	      for(int p=1; p<=4; p++)
	      {
	    	  for (int q=1; q<=space+1; q++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(int r=1; r<=star; r++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	    	  
	    	  space++;
	      
	    	  
	    	  
	    	  
	    	  
	      }
	}
	
}
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

