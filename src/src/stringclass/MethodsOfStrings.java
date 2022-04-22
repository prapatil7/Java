package src.stringclass;

public class MethodsOfStrings {
	public static void main(String[] args) {
 // 1. equals method
	String s1= "pratik";
	String s2= "pratik";
	boolean k=s1.equals(s2);
    System.out.println(k);
    System.out.println("********************************************");

 // 2. equals ignore method
    
    String s3= "patil";
    String s4= "pratik";
    boolean k1 =s3.equalsIgnoreCase(s4);
	System.out.println(k1);
	System.out.println("**********************************************");
	
 
  // 3. charAt method
	String s5= "maharashtra";
	 char value= s5.charAt(0);
		 System.out.println(value);
	 System.out.println("***********************************************");
	
	char value1= s5.charAt(0);
	char value2= s5.charAt(1);
	char value3= s5.charAt(2);
	char value4= s5.charAt(3);
	char value5= s5.charAt(4);
	char value6= s5.charAt(5);
	char value7= s5.charAt(6);
	char value8= s5.charAt(7);
	char value9= s5.charAt(8);
	char value10= s5.charAt(9);
	char value11= s5.charAt(10);
	
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println(value4);
	System.out.println(value5);
	System.out.println(value6);
	System.out.println(value7);
	System.out.println(value8);
	System.out.println(value9);
	System.out.println(value10);
	System.out.println(value11);
	
	System.out.println("***************************************************");
//
//for (int i=0; i<=10; i++)
//{
//	char value = s5.charAt(i);
//	System.out.println(value);
//}

  System.out.println("*********************************************************");
	
	// 4. concat method
	
	String s6= "velocity";
	
	System.out.println(s6.concat("corporate"));
	System.out.println("*********************************************************");
	
	// 5. contains
	 String s7= "pqrstu";
	 boolean b= s7.contains("rstv");
	 boolean b1 = s7.contains("rstu");	
			 System.out.println(b);
			 System.out.println(b1);
			 
			 String s8=new String("abcde");
			 boolean b2= s8.contains("bcd");
			 System.out.println(b2);
	 System.out.println("******************************************************");
	
	 // WAP to print string in a reverse form
	String s9= "Velocity";
	for (int i=7; i>=0; i--)
	{
		char c1 =s9.charAt(i);
	    System.out.print(c1);
	}
	    System.out.println();
	   System.out.println("******************************************************");
	   
	   // 6. subString method
	   
	   String s10= "Velocity";
	         String s11=s10.substring(4);
	         System.out.println(s11);
	         System.out.println("***************************************************");
	   
	   // 7. subString(int beginindex, int endindex)
	         String s12= "understandable";
	         String s13=s12.substring(5,10);
	         System.out.println(s13);
	   
	    // 8. Length()
	        String s14= "INDIA";
	       int s15= s14.length();
	       System.out.println(s15);
	       System.out.println("*******************************************************");
	     
	       
	    // 9. indexOf method
	       String s16= "amalner";
	       int c2= s16.indexOf('l');
	       System.out.println(c2);
	       System.out.println("*********************************************************");
	       
	     // assignment
	       //2. WAP for 
	       String s17= "velocity";
	       for (int i=0;i<=7;i++)
	       {
	               char c3=s17.charAt(i);
	               int i3= s17.indexOf(c3);
	               
	               System.out.print(" "+c3);
	               System.out.print(i3 + " ");      
	       }
	       System.out.println("***********************************************");
	       
	       // 10. replaceMethod
	       
	       String s18= "Adverd";
	       String c4=s18.replace('v', 's');
	       System.out.println(c4);
	       
	       System.out.println("****************************************************");
	      
	       //11. replace old String to new String
	       
	       String s19= "Adverd Daniel";
	         String s20=s19.replace("Daniel", "Lucii");
	         System.out.println(s20);
	         System.out.println("****************************************************");
	       
	        // 12. toLowerCase
	         
	         String s21="ABSCF";
	         String s22=s21.toLowerCase();
	         System.out.println(s22);
	         System.out.println("****************************************************");
	         
	         //13 
	         String s23="abscdef";
	         String s24=s23.toUpperCase();
	         System.out.println(s24);
	         
	         System.out.println("************************************************************");
         
	       // 14 trim()
	         
	         String s25= "  val ue ";
	        String s26=s25.trim();
	        System.out.println(s26);
	         System.out.println("****************************************************");

         // 15 split()	         
	         
	       String s27= "this is a string";
	       String[] s28= s27.split("h");
          
	      
	       for (int p=0; p<=s27.length(); p++)
	       {
	    	   System.out.println(s28[p]);
	       }
	       
	       // 16 toCharArray()
//	       
//	         String s29= "pratik";
//	        char [] s30= s29.toCharArray();
//	        for (int u=0; u<=s30.length-1;u++)
//	        {
//	        	System.out.println(s30[u]);
//	        }
	        
	        String s30 = "Velocity";
	   	 
	    	char[] s31 = s30.toCharArray();
	    	
	    	for(char c :s31)
	    	{
	    		System.out.println(c);
	    	}

	       
	       
	       
	       
	       
	       
	   
}
	
}
