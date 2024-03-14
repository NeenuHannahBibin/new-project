package Loopingstatement;

import java.util.Scanner;

public class OnedimenArrayStringForeach {

	public static void main(String[] args) {

		String str[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names");
		for(int i=0;i<4;i++)
		{
			str[i]=sc.next();
			
		}
		System.out.println("enterd names are");
		for(String ss:str)
		{
			System.out.println(ss);
		}
	}

}
