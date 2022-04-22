package src.logicalprogram;
public class PrimeNumber1 {
	public static void main(String[] args) {
		int temp=0;
		
		System.out.println("prime numbers are: ");
		for(int i=1; i<=10; i++)
		{
			for(int j=2; j<(i-1); j++)
			if (i%j==0)
			{
				temp++;
			}
			if (temp==0)
			{
				
				System.out.println(i);
			}
			else
			{
		        temp=0;
			}
		}
	}
}