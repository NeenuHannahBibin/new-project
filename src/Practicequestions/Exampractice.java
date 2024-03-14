package Practicequestions;

import java.util.Scanner;

public class Exampractice {

	public static void main(String[] args) {
		
		//reverse
		/*System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int length=str.length();
		String ch=" ";
		for(int i=0;i<length;i++)
		{
		ch=str.charAt(i)+ch;	
			
		}
		System.out.println("the reverse of a string ="+ch);
*/
		
		//====factorial
		/*System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("the factorial of a number is= "+fact) ;*/
		
		// palindrome of a number
		/*System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int rev=0;
		for(int a=num;a>0;a=a/10)
		{
		rev=(rev*10)+a%10;	
			
		}
		if(rev==num)
		{
		System.out.println("the number is palindrome");
	}
		else {
			System.out.println("the number is not a palindrome");
		}*/
		
		int i;
	    for (i = 1; i <= 12; i += 2)
	    {
	      if (i == 8) {
	        System.out.println(i);
	        break;
	      }
	    }
		
		}
	
}
