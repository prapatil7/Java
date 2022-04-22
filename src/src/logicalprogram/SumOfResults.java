package src.logicalprogram;
public class SumOfResults {
	
	// for printing the sum of numbers from 1 to 10
	// sum += is the logic which is used to print the sum of numbers set in the loop
	
	public static void main(String[] args) 
	{
       int sum=0;
	
		 for (int i=1; i<=10; i++)
		 {
			 
			 sum += 1*i;                // we required all numbers sum hence we used 1*i
			                             // whenever we required the sum of the even numbers we will use-  sum += 2*i	 
		 }
		 System.out.println(sum);
		 
	}

}
