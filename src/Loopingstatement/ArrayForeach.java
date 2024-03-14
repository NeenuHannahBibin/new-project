package Loopingstatement;

import java.util.Scanner;

public class ArrayForeach {

	public static void main(String[] args) {
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
for(int i=0;i<=4;i++)
{
	a[i]=sc.nextInt();

}
System.out.println(" entered numbers are ");
for(int v:a)
{
System.out.println(v)	;

}
	}

}
