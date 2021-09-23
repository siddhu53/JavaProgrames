
import java.io.*;

public class ArrOperations {	
	
	public static void displayArray(int arr[])
	{
		System.out.println("The third largest number is:"+arr[2]);
	
	}
	
	public static void bubbleSort(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			int j=1;
			while(j<arr.length-i)
			{
				
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
		}
		
		displayArray(arr);		
	}
	
	public static void main(String args[]) throws IOException
	{
		int[] arr = new int[5];
		int N=arr.length;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the elements in the array");
		
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		bubbleSort(arr);
	}
}
