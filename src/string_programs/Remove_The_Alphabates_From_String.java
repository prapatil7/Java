package string_programs;

public class Remove_The_Alphabates_From_String {
	public static void main(String[] args) {
	String s1 = "iiviljjjjzasjlaaAA SALOI874 87879898787fr546563555$%#$^$&6454";
	String s2= s1.replaceAll("[a-zA-Z]", "");
	String s3= s2.replaceAll(" ", "");
	System.out.println(s3);
	
	System.out.println("---------------------------------------------------------------------");
	
	String s4="&34#$$$%sdf EG%$^%$^DFg rghj@$#5478e7f8 v7t";
	
	String s5=s4.replaceAll("[^A-Za-z0-9]","");
	System.out.println(s5);
			
			
    
	}
}
