package Loopingstatement;

import java.util.Scanner;

public class OnedimeArrayString {

	public static void main(String[] args) {
String str[]=new String[3];
Scanner sc=new Scanner(System.in);
System.out.println(" enter the names ");
for(int i=0;i<3;i++)
{
str[i]=sc.next();	

}
System.out.println(" the names are" );
for(int i=0;i<3;i++)
{
System.out.println(str[i])	;

}

	}

}
