package string_programs;

public class PaledromeOfString {
	//Paledrome means eg.= eye==eye if inverse order also
	public static void main(String[] args) {
		int num= 121;
		int originalnumber= num;
		int r=0;
		
		while (num!=0)
		{
			int rem=num%10;         //rem=remainder
			r=rem+r*10;
			num=num/10;
		}
		System.out.println(r);
		
		if (originalnumber==r)
		{
			System.out.println("It is a palindrome no.");
		}
		
	}

	

}
