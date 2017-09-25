
public class FibonacciRecursion {
	static int i=0;
	static int j=1;
	static int sum=0;
	
	static void printFibonacci(int count)
	{
		if(count>0) 
		{
			
			sum=i+j;
			i=j;
			j=sum;
			System.out.print( " "+sum);
			printFibonacci(count-1);
			
		}
		}
		public static void  main(String args[])
		{
			int count=10;
			System.out.print(i +" " +j);
			printFibonacci(count-2);
		}
		
	}

	
