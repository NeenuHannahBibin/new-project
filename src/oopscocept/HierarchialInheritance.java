package oopscocept;


	class Dogs
	{
	public void barking()
	{
		
		
		System.out.println("the dog is barking");
	}
	}
	class Cats extends Dogs
	{
		public void sleeping()
		{
			
			System.out.println("the cat is sleeping");
			
		}
		
		
	}
		
	class Lions extends Dogs
	{
		
	public void running()
	{
		
	System.out.println("the lion is running");	
		
	}
		
	}
	public class HierarchialInheritance {
	public static void main(String[] args) {
		
		Lions l=new Lions();
		l.barking();
		l.running();
		Cats c=new Cats();
		c.barking();
		c.sleeping();

	}

}
