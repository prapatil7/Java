package src.logicalprogram;

public class FibonacciSeries {
	
// fibonacci series means next number is sum of the previous number
// two numbers for example 0,1,1,2,3,5,8,13,21,34,55,....etc
 // first two no.s in fibonacci series are 0 and 1.
	public static void main(String[] args) 
	{
		 int a=0;
		 int b=1;
		 int c;
		 
		 for(int i=1; i<=10; i++)
		 {
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
		 }
		
		
		
		
		
		
		
		
	}
		

}
