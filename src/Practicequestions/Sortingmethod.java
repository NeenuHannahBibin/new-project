package Practicequestions;

import java.util.Scanner;

public class Sortingmethod {
	
	public int[] readnumber(int a,Scanner sc)
	{
		int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		
		arr[i]=sc.nextInt();
	}
		return arr;
	}
	public int[] sorting(int arr[],int a)
	{
	for(int i=0;i<a;i++)
	{
		
		for(int j=0;j<a;j++)
		{
			if((j+1!=a) && (arr[j]>arr[j+1]))
			{
		int temp;
		temp=arr[j+1];
		arr[j+1]=arr[j];
		arr[j]=temp;
		
			}	
		}
	}
	return arr;
	}
	
	public void displaynumber(int arr[])
	{
		
		for(int b:arr)
		{
		System.out.println(b);	
			
		}
	}
		
		
	

	public static void main(String[] args ) {
System.out.println("enter the size of array");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter the numbers into an ");
Sortingmethod s=new Sortingmethod();
int c[]=s.readnumber(a, sc);
int d[]=s.sorting(c, a);
System.out.println("the sorted array is");
s.displaynumber(d);

	}

}
