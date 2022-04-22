package stringclass;

public class CharAt {
public static void main(String[] args) {    
	String s= "mount fuji";
	        char c=s.charAt(2);
	           System.out.println(c);
	           for (int i=0; i<s.length(); i++)
	           { 
                  char a= s.charAt(i);
                  System.out.print(a);
                  
                      
	           }
	           for (int j=(s.length())-1; j>=0; j--)
	           {
	        	   char b= s.charAt(j);
	        	   System.out.print(b);
	           }
}
}
