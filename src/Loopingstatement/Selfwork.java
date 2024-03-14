package Loopingstatement;

import java.util.Scanner;

public class Selfwork {

	public static void main(String[] args) {
		
//step 1 : read the size of the array
System.out.println("enter the size of array");		
Scanner sc=new Scanner(System.in);
int arr=sc.nextInt();
//step 2 : read all the numbers
System.out.println("enter the numbers");
int a[]=new int[arr];
for(int i=0;i<arr;i++ )
{
	a[i]=sc.nextInt();

}
		
//step 3 : sort the array
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


//step 4 : print the sorted array
System.out.println("The sorted array is");
for(int b:a)
{
	System.out.println(b);
}
	

		
		
		
		
		
		
		
		/*
System.out.println("enter the numbers");
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++)
{
	
	for(int j=0;j<5;j++)
	{

		a[i]=sc.nextInt();
		int temp=0;
		if(a[i]>a[i+1])
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;

		
		}
		}
System.out.println(a[i]);
}

	*/
		
		
}
}
