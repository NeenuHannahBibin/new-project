package oopscocept;

class Car
{
	
public void speed()
{
	System.out.println("car speed");

}
public void power()
{
System.out.println("car power");	

}

}
class Bmw extends Car
{

	@Override
	public void speed()
	{
		System.out.println("bmw speed");
		super.speed();
	}

	@Override
	public void power() 
	{
		
		System.out.println("bmw power");
		super.power();
	}
	



}


public class Methodoverriding {

	public static void main(String[] args) {
		Bmw ob=new Bmw();
		ob.power();
		ob.speed();

	}

}
