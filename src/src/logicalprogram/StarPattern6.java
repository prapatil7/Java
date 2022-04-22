package src.logicalprogram;

public class StarPattern6 {

	public static void main(String[] args) {
		int star=5;
		int space=3;
		
		for(int i=1; i<=30; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space=space-2;
			star=star-2;
		}
	}
	
}
