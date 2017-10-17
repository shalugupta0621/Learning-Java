
public class Selection {
	
	static void selectionSort(int [] A)
	{
		for(int i=0; i<A.length-1; i++)
		{
			int index=i;
			for(int j=i+1; j<A.length; j++)	
			{
				if(A[j] < A[index])
				{
				index=j;	
				}
			}
			int smallerNumber = A[index];
			A[index]=A[i];
			A[i]= smallerNumber;
		}
		
	}
	

	
	
	public static void main (String args[])
	{
		int[] arr= {23,10,34,2,15,0};
		System.out.println("Before sorting");
		for(int i=0; i<arr.length;i++ )
		{
			System.out.print(arr[i]+" ");
		}
		
		selectionSort(arr);
		System.out.println();
		System.out.println("After sorting");
		for(int i=0; i<arr.length;i++ )
		{
			System.out.print(arr[i]+" ");
		}
	}
}
