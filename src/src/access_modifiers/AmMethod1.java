package src.access_modifiers;

public class AmMethod1 {
	
	int p;
	
	public void m1()
	{
		
		System.out.println("hello");
		System.out.println(this.p);
	}
  
	static void m6()
	{
		System.out.println("hii");
	}
	
	void m7()
	{
		System.out.println("hihello");
	}
	
	private static void m2()
	{
		int i=59;
		int j=79;
		int ans=i+j;
		System.out.println(ans);
	}
	
	private void m3 (int a)
	{    a=89;
		int b=49;
		int ans=a-b;
		System.out.println(ans);
	}
	protected static void m4()
	{
		System.out.println("arithmatic");
	}
	protected void m3(int a, int b)
	{
		int ans=a+b;
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		AmMethod1 w=new AmMethod1();
	    w.m1();
		m2();
		w.m3(40);
		m4();
		w.m3(50,60);
	}
}