package src.stringclass;

public class StringsPractice {
	public static void main(String[] args) {
		
	
	String s1=new String("abc");
	
	String s2= "kbc";
	String s3="abc";
	
	boolean k1=s2.equals(s3);     // checking same content
	System.out.println(k1);
	
	boolean k2=s2==(s3);           // checking same object
	System.out.println(k2);
	
	
	boolean k =s1.equals(s2);
	System.out.println(k);
	
	
	String s4 = "pratik";
	System.out.println(s4+ "group 9");    // by concating string with another object the main content of string is not chages without assigning it
	System.out.println(s4);              // here s4 will show its value as poratik nd not the concated value so this is called as
	                                     // immutable behaviour of strings

	s4.concat("group 9");
	System.out.println(s4);    //pratik
	String s5= s4.concat("group 9");
	System.out.println(s5);    // pratik grpoup 9
	
	StringBuffer s6=new StringBuffer("patil");
	s6.append("group 9");
	System.out.println(s6);   // patilgroup9    as it value changes without assigning it so it is mutable behaviour of string buffer
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
}