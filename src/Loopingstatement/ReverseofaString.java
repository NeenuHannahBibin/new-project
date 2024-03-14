package Loopingstatement;

import java.util.Scanner;

public class ReverseofaString {

	public static void main(String[] args) {
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
String str=sc.next();
int length=str.length();
String reverse=" ";
for(int i=0;i<length;i++)
{
reverse=str.charAt(i)+reverse;	


}
System.out.println("the reverse of a string is");
System.out.println(reverse);
	}

}
