package src.arrays;

public class FindEvenNumbersFromArray {
	public static void main(String[] args) {
		
	int [] a= {1,2,3,4,5};	
	int x;
	
	for (int i=0; i<a.length; i++)
	{
	  x= a[i];
	  if (x%2==0)
	  {
		  System.out.println(x);
	  }
	  else
	  {
		 continue;
	  }	
	}
	
	//FOR COUNTING EVEN AND ODD NUMBERS IN ARRAY
	
	int [] b= {50,65,889,55,203,20,10256};
	int even=0;   int odd=0; int k;
	for (int j=0; j<b.length; j++)
	{
		if (b[j]%2==0)
		{
			even++;
		}
		else
		{
			odd++;	
		} 
	}
	 System.out.println("total even numbers are: "+even);
     
     System.out.println("number of odd numbers are: "+odd);
	
	
	
	
 }
}
