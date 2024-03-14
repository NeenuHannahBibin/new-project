package Loopingstatement;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Boolean flag=true;
		if(n>3 )
		{			
			
		for(int i=2;i<n;i++)	
		{
			if(n%i==0)
			{
			//	System.out.println(i);
			//System.out.println("its not a prime number");	
				flag=false;
			break;
			}
			
		}
		//System.out.println("its a prime number");	
		}
	if(flag)	
	{
		System.out.println("its a prime number");
		
	}
	else
	{
		
		System.out.println("not a prime number");
	}
		
	}

}
