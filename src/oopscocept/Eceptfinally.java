package oopscocept;

public class Eceptfinally {

	public static void main(String[] args) {
System.out.println("started");
try
{
	
int i=10;
System.out.println(i/0);
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());

}
	finally
	{
		
		System.out.println("the finally completed");
		
	}
System.out.println("stopped");
	}

}
