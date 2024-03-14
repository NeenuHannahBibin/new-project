package Loopingstatement;

import java.util.Scanner;

	public class FibonacciSeries {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c;
		int count=10;
		System.out.print(a + " " + b+" ");
		for(int i=2;i<count;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c + " " );

		}

	
		
		}

	}
