package Practicequestions;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
System.out.println("enter a character");
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c >='a' && c<='z') || (c>='A' && c<='Z'))
{
	System.out.println("is an alphabet");
}
else
{
	System.out.println("is not an alphabet");
}
	}

}
