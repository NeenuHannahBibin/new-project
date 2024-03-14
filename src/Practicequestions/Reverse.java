package Practicequestions;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
String str=sc.next();
String rev=" ";
int length=str.length();
for(int i=0;i<length;i++)
{
	
rev=str.charAt(i)+rev;
}
System.out.println("the reverse of a string is "+rev);
	}

}
