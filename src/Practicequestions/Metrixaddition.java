package Practicequestions;

import java.util.Scanner;

public class Metrixaddition {

	public static void main(String[] args) {
//array declaration
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int add[][]=new int[3][3];
	
	Scanner sc=new Scanner(System.in);
	//enter the values to matrix a
	System.out.println("enter the elements into array a");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		a[i][j]=sc.nextInt();	
			
		}
		
		
	}
	//enter the values to matrix b
	System.out.println("enter the elements unto array b");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			b[i][j]=sc.nextInt();
			
		}
		
	}
	System.out.println("enterd numbers of array a");
	//entered numbers of array a
	for(int c[]:a)
	{
		for(int d:c)
		{
		System.out.print(d +" ");	
			
		}
		System.out.println();
	}
	//entered numbers of array b
	System.out.println("enterd numbers of array b");
	for(int j[]:b)
	{
		for(int h:j)
		{
		System.out.print(h +" ");	
			
		}
		System.out.println();
	}
	
	
    //array addition
	System.out.println("the sum of metrix");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			add [i][j]=a[i][j]+b[i][j]	;
			System.out.print(" "+add[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	}

}
