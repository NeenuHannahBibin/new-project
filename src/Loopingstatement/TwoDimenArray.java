package Loopingstatement;

import java.util.Scanner;

public class TwoDimenArray {

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
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
				System.out.print(str[i][j]+" ");	
					
				}
			System.out.println()	;
			}
		

	}

}
