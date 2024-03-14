package Loopingstatement;

import java.util.Scanner;

public class Panindrome_ofa_number {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int r=0;
		for(int a=num;a>0;a=a/10)
		{
			
		r=(r*10	)+(a%10);
					
		}
		if(num==r)
		{
		System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not a palindrome");
		}
	}

}
