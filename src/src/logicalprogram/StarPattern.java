package src.logicalprogram;

public class StarPattern {

//	*****
//	****
//	***
//	**
//	*
	public static void main(String[] args) 
	{
	     int star=5;             // put no. of stars in first row here
	     for(int i=1; i<=5;i++)   // for loop for outer loop i.e. rows
	     {
	    	for(int j=0; j<=star-1;j++)    // for loop for inner loop i.e. columns
	    	{
	    		System.out.print("*");     // we used print instead of println because we want to print stars on same line
	    	}
	    	System.out.println(" ");       // we used println because now the line will change 
	    	star--;                          // as we taken star value as no. of stars in respectibve lines so the stars gonna drcrease so we taken star-- here
	     }
	}
}
