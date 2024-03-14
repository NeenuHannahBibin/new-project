package oopscocept;


class Parent
{
	String name="neenu";
	public void phone()
	{
		
		System.out.println("nokia");
	}
	
	}

class Child extends Parent
{
public void phone()
{
System.out.println("iphone");	
super.phone();
System.out.println(super.name);

}



}
public class Methodoverrinding2 {

	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.phone();

	}

}
