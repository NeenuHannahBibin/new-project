package Loopingstatement;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args)
	{
//read the size of an array
		System.out.println("enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
// enter the elements to an array
		System.out.println("enter the numbers");
		int arr[]=new int[n];
		int rev[]=new int[n];
// read the array
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
		}
//reversing array
		int j=n-1;
		for(int i=0;i<n;i++)
		{
			rev[j]=arr[i];
			j--;
		}
		
//display the reverse array
		System.out.println("the reversed array is");
	for(int b:rev)
	{
		
		System.out.println(b);
	}
		
		
		
		
	}

}
