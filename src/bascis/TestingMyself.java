package bascis;

import java.util.Scanner;

public class TestingMyself {

	public static void main(String[] args) {
//factorial of a number
	/*System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		
	fact=fact*i;
		
		
	}
	System.out.println("factorial of a number is"+" "+ fact);
		 
	 */
	//--------------------------------------------------------------------------	
	// Palindrome of a number	
		
	/*  System.out.println("enter a number");
	Scanner sc=new  Scanner(System.in);
	int num=sc.nextInt();
	int rev=0;
	for(int a=num;a>0;a=a/10)
	{
	rev=(rev*10)+(a%10);	
		
	}
		if(num==rev)
		{
	System.out.println("the number is palindrome");	
		}
		else
			{
			System.out.println("the number is not a palindrome");
			}
	*/
		//--------------------------------------------------------------------
		
		//fibonacci series
		
		/* System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int a=1;
		int b=1;
		int c;
		System.out.print(a+" " + b + " ");
		for(int i=2;i<count;i++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" "); 
			
			
		} */
		
	//-----------------------------------------------------------------------------------
		
		//Reverse of a string
		System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int length=str.length();
		String ch=" ";
		for(int i=0;i<length;i++)
		{
		ch=str.charAt(i)+ch;	
			
		}
		System.out.println("the reverse of a string ="+ch);
	//--------------------------------------------------------------------------------------	
		
	// sorting of given numbers
		
	/*	System.out.println("enter the limit of numbers");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the numbers");

		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int j=0;j<a;j++)
		{
		for(int k=0;k<a;k++)
		{
		if(k+1!=a && arr[k]>arr[k+1])
		{
			int temp;
			temp=arr[k];
			arr[k]=arr[k+1];
			arr[k+1]=temp;
			
		}
			
			
		}
			
			
		}		
			
		
		System.out.println("the enterd numbers are");
		for(int b:arr)
		{
			System.out.println(b);
		}
		*/
		
		//-----------------------------------------------------------
		
		// prime number
		
		//Read a number
		/*
		System.out.println("enter a number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		boolean flag=true;
		//division of number
		if(n>3)
		{
			for(int i=2;i<n/2;i++)
			{
			if(n%i==0)
			{
			flag=false;
			break;
				
			}
				
			}
			
			
		}
		//display the number
		if(flag)
		{
		System.out.println("The number is a prime number");	
			
		}
		else
		{
			
		System.out.println("the number is not a prime nubmber");	
			
		}
		
		*/
		
		//------------------------------------------------------------

		//count vowels in a string
		
		// Read string
		/*
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int length=str.length();
		int count=0;
		
		// store the string into an char array
		char s[]=str.toCharArray();
		
		// count the vowels
		
		for(int i=0;i<length;i++)
			
		{
		if(s[i]=='a' || s[i]=='e' || s[i]=='i'|| s[i]=='o'|| s[i]=='u')	
		{
			
		count=count+1;	
		}
			
		}
		// display the count
		
		System.out.println("the count of vowels="+count);
		*/
		
		//-----------------------------------------------------------
		
		// largest of an array
		
		
		//read the size of an array
		System.out.println("enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//read numbers to an array
		System.out.println("enter the numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		//find the largest of an array
		for( int i=0;i<n;i++)
		{
			if(i+1!=n && arr[i]>arr[i+1])
			{
			int temp;
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}
			
		}
		
		// display the largest in the array
		
		System.out.println("the largest number is="+arr[n-1]);
	}

	
	}

	
	

