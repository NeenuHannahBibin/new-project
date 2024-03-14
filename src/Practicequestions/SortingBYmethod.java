package Practicequestions;
import java.util.Scanner;

public class SortingBYmethod {
	
	
	public int[] readnumbers(int x,Scanner y)
	{
		
		int a[]=new int[x];
		for(int i=0;i<x;i++ )
		{
			a[i]=y.nextInt();

		}
	return a;

	}
	public int [] sortnumbers(int a[],int arr)
	{
		
		for(int i=0;i<arr;i++)
		{
			
		for(int j=0;j<arr;j++)
		{
			
		if((j+1!=arr)&&( a[j]>a[j+1]))
		{
		int temp;
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;

		}


		}
		}
	return a;
	         }
	public void printsortednumbers(int a[])
	{
		
		for(int b:a)
		{
			System.out.println(b);
		}
			

	}

	public static void main(String[] args)
	{
		
		//step 1 : read the size of the array
		System.out.println("enter the size of array");		
		Scanner sc=new Scanner(System.in);
		int arr=sc.nextInt();
		//step 2 : read all the numbers
		System.out.println("enter the numbers");
		SortingBYmethod ob=new SortingBYmethod();
		int a[]=ob.readnumbers(arr,sc);

			//step 3 : sort the array
		int b[]=ob.sortnumbers(a,arr);

		//step 4 : print the sorted array
		System.out.println("The sorted array is");

		 ob.printsortednumbers(b);
				
		}
		
		
		

			
		

	}


