
public class Insertion {
static void insertionSort(int[] arr)
{

	
	  int n = arr.length;  
      for (int j = 1; j < n; j++) {  
          int key = arr[j];  
          int i = j-1;  
          while ( (i > -1) && ( arr[i] > key ) ) {  
              arr [i+1] = arr [i];  
              i--;  
          }  
          arr[i+1] = key;  
      }  
      
  }  
    
     
  public static void main(String args[]){    
      int[] arr1 = {9,14,3,2,43,11,58,22};   
      System.out.println("Before sorting");
      for(int i=0;i<arr1.length;i++)
      {
    	  System.out.print(arr1[i]+ " ");
      }
      
      insertionSort(arr1);
      System.out.println();
      System.out.println("After sorting");
      for(int i=0;i<arr1.length;i++)
      {
    	  System.out.print(arr1[i]+ " ");
      }
      
      
      
    
}
}
