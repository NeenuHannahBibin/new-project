package oopscocept;

public class CompileTimeEcxeption {

	public static void main(String[] args) {
		
		int a=10,b=0;
		try
		{
		int c=a/b;
		System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			//System.out.println("arithametc excaption");
			System.out.println(e.getMessage());
		}
System.out.println("completed");
	}}

	//try
	//{
		//starting name=null;
	//System.out.println(name.length());
	
	//}
	

