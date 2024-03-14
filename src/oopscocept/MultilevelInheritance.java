package oopscocept;


class Doga
{
	public void barking()
	{
		System.out.println("the dog is barking");
		
		
	}


}
class Cata extends Doga
{
	
public void sleeping()
{
	
System.out.println("the cat is sleeping");

}

}
class Lion extends Cata
{
	
public void running()
{
System.out.println("the lion is running");	

}

}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Lion l=new Lion();
		l.barking();
		l.running();
		l.sleeping();

	}

}
