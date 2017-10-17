
public class SwapNumber {
	int a;
	int b;
	
	public SwapNumber(int a, int b) {
    this.a = a;
	this.b= b;
	}
	
	public void swap()
	{
		System.out.println("Before swapping 1st num:" + a);
		System.out.println("Before swapping 2nd num:" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping 1st num:" + a);
		System.out.println("After swapping 2nd num:" + b);
		
	}
	
	public static void main(String args[])
	{
		SwapNumber s= new SwapNumber( 10, 20);
		s.swap();
	}
}
