import java.util.*;  
public class BubbleSort 
{
	 
	    static void Bsort(int[] arr,int N) 
	    {  
	        int temp = 0;  
	         for(int i=0;i<N;i++)
	         {  
	                 for(int j=1; j<(N-i);j++)
	                 {  
	                          if(arr[j-1] > arr[j])
	                          {  
	                                   
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	         }  
	  
	      

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int N,k;
		System.out.println("Enter the size of array: \n");
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		int arr1[] = new int[N];
		System.out.println("Input the elements of the array : \n");
		for(int i = 0;i<N;i++)
		{k = sc.nextInt();
			arr1[i] = k;
		}
		Bsort(arr1,N);
		System.out.println("After Bubble Sort: \n");  
        for(int i=0;i<N;i++)
        {  
                System.out.print(arr1[i] + " ");  
        }  
		

	}

}
