package src.logicalprogram;

public class MobileNoCheck {
	 public MobileNoCheck (long a)
	 {
		 if (a>11)
		 {
			System.out.println(a +" mobile number has valid number of digits"); 
		 }
		 else
		 {
			 System.out.println(a + " mob. no. has not valid no. of digits");
		 }
	 }
	
	public static void main(String[] args) 
	{
		MobileNoCheck n=new MobileNoCheck(99887744556l);
		
	}	
}
