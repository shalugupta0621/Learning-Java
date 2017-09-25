class Fibonacci{  
	public static void main(String args[]) {
	int i=0;
	int j=1;
	int sum;
	System.out.print(i+" " +j);
	
		while( i<=10)
		{
      
		sum=i+j;
		 System.out.print(" " + sum);
		
		 
		i=j;
		j=sum;
		 
		}
	}
}