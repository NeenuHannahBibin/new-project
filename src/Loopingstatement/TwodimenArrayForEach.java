package Loopingstatement;

import java.util.Scanner;

public class TwodimenArrayForEach {

	public static void main(String[] args) {
String str[][]=new String[2][3];
Scanner sc=new Scanner(System.in);
System.out.println("enter the names");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
str[i][j]=sc.next();	
}

}
System.out.println("enterd names");
for(String a[]: str)
{
	
for(String b:a)
{
System.out.print(b+" ");	
}
System.out.println();
}
	
	}

}
