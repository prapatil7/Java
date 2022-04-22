package src.logicalprogram;

public class Lcm {
	// gcd means greatest 
	
	public static void main(String[] args) {
	  int t=17;
	  int u=51;
	  
	  int gcd=1;
	  
	  for(int v=1; v<=t && v<=u; v++)
	  {
		  if(t%v==0 && u%v==0)
		  {
			  gcd=v;
		  }  
	  }
	  
	  int lcm=(t*u)/gcd;
	  System.out.println(lcm);
	}
}
