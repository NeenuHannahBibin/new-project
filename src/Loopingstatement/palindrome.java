package Loopingstatement;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int a=num;
		int r=0;
		while ( a>0)
		{
		r=(r*10)+(a%10);
		a=a/10;
		}

		if(r==num)
		{
		System.out.println("the number is palindrome");		
		
		}
		else
		{
	
		System.out.println("the number is not palindrome");
		}
}
}