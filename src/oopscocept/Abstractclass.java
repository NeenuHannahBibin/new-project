package oopscocept;
abstract class google
{
	public void message()
	{
		System.out.println("thank u for using google");
	}
	abstract void search();
}
class Searchall extends google
{

	@Override
	void search()
	{
		System.out.println("thank you for searching");
	}
}
class Image extends google
{

	@Override
	void search() 
	{
	System.out.println("images are here");	
	}
	
}
public class Abstractclass {

	public static void main(String[] args) {
		Searchall s=new Searchall();
		s.message();
		s.search();
		Image i=new Image();
		i.message();
		i.search();
		

	}

}
