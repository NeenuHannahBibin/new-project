package Practicequestions;

import java.util.Scanner;

class rectangle
{
	int width;
	int height;
	public void area()
	{
		int c=this.width*this.height;
		System.out.println("the area of rectangle ="+c);
	}
	public void perimeter()
	{
		int p=2*(this.width+this.height);
		System.out.println("the perimeter of rectangle is ="+p);
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}
	public void setHight(int hight) 
	{
		this.height = hight;
	}

}

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		rectangle r=new rectangle();
		System.out.println("please enter the width");
		int w=sc.nextInt();
		System.out.println("please enter the hight");
		int h=sc.nextInt();
		r.setHight(h);
		r.setWidth(w);
		r.area();
		r.perimeter();

	}

}
