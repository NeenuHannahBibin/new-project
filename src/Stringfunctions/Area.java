package Stringfunctions;

public class Area {

	
	public void rectanglearea()
	{
	int a=10;
	int b=20;
	int area=a*b;
	System.out.println("The area of rectangle is ="+area);	
		
	}
	public int squarearea(int a)
	{
	int area=a*a;	
	return area;	
		
		
		
	}
	public void trianglearea(int a,int b )
	{
	double area;
	area=.5*a*b;
	System.out.println("The area of triangle is="+area);
		
	}
	
	public double circlearea()
	{
		int r=5;
		double area=3.14*r*r;
		return area;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Area ob1=new Area();
		ob1.rectanglearea();
		System.out.println("The area of square is="+ob1.squarearea(10));
		ob1.trianglearea(8, 9);
		System.out.println("The area of cirlce is="+ob1.circlearea());

	}

}
