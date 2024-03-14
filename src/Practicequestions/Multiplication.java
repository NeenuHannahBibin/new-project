package Practicequestions;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
// enter a number
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//set the limit of multiplication
		System.out.println("enter the limit of multiplication");
		int limit=sc.nextInt();
//multiplication
		int mul;
		for(int i=1;i<=limit;i++)
		{
		mul=n*i;	
			
		System.out.println(n+"*"+i+"="+mul);	
		}
		
		
		
		
	}

}
