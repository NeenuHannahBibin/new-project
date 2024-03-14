package oopscocept;


public class Methodoverloading {
	public void add()
	{
		int a=15;
		int b=25;
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
		
		
	}
	public void add(int a,int b,int c)
	{
		
	int d=a+b+c;
	System.out.println(d);
		
	}
	public void add(int a,double b)
	{
		double value =a+b;
		System.out.println(value);
		
		
	}
	public void add(double a,int b)
	{
	double value=a+b;
	System.out.println(value);
		
		
	}

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(5, 6.6);
		ob.add(4.5, 9);
		ob.add(10, 20);
		ob.add(10, 20, 30);

	}

}
