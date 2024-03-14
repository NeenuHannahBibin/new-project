package Loopingstatement;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {

		System.out.println("enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("enter the numbers in to an array");
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		
		for(int i=0;i<a;i++)
		{
			
				if( i+1!=a && arr[i]>arr[i+1])
						{
					int temp;
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					
					
						}
				
			}
		System.out.println("the largest number is "+arr[a-1]);	
	}
		}
		
		
		


