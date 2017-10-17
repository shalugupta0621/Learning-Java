
public class ArmstrongNum {
	public static void main (String args[])
	{
		int n= 153;
		int sum=0, temp,a;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum= sum+(a*a*a);
			
		}
		if(sum==temp)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}
}
