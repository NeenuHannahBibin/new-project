package oopscocept;

class Dog
{
	public void barking()
	{
		System.out.println("the dog is barking");
	}
}
class Cat extends Dog
{
	public void sleeping()
	{
	System.out.println("the cat is sleeping");	
		
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		
	Cat c=new Cat();
	c.barking();
	c.sleeping();

	}

}
