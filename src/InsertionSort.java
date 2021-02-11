import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args)
	{  int N,k;
	System.out.println("Enter the size of array: \n");
	Scanner sc= new Scanner(System.in);
	N = sc.nextInt();
	int arr1[] = new int[N];
	System.out.println("Input the elements of the array : \n");
	for(int i = 0;i<N;i++)
	{k = sc.nextInt();
		arr1[i] = k;
	}
	    for(int i=1; i<N; i++)   
	    {  
	        int temp = arr1[i];  
	        int j= i-1;  
	        while(j>=0 && temp <= arr1[j])  
	        {  
	            arr1[j+1] = arr1[j];   
	            j = j-1;  
	        }  
	        arr1[j+1] = temp;  
	    }  
	    System.out.println("Array after Sorting: \n");  
	    for(int i=0;i<N;i++)  
	    {  
	        System.out.println(arr1[i]);  
	    }  
	}  

}
