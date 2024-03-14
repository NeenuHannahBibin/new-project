package Loopingstatement;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		System.out.println("enter a string");
		Scanner sc =new Scanner(System.in);
		 String str=sc.next();
		int length=str.length();
		int count=0;
		char c[]=str.toCharArray();
		
		
		
			 for(int i=0;i<length;i++)
			 {
			 if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') 
			 {
				 
				 count=count+1;
				 
			 }
			
		 }
			 System.out.println("the count of vowels is="+count);
			
		
	}

}
