package oopscocept;


class A
{
	void m1()
	{
		
	int a=10;
	System.out.println(a);
		
	}

}
class B extends A
{
	void m1()
	{
		int a=20;
		System.out.println(a);
		
		
	}


}
public class Polymorphism {

	public static void main(String[] args) {
		B ob=new B();
		ob.m1();

	}

}
