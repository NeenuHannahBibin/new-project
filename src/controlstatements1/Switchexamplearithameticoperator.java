package controlstatements1;

public class Switchexamplearithameticoperator {


	public static void main(String[] args) {
int a=40;
int b=20;
	String  str="*";	
		
		switch (str)
		{
			case "+": System.out.println("addition  "+(a+b));
			break;
			case "*":System.out.println("multiplication  "+(a*b));
			break;
			case "-":System.out.println("Substraction  "+(a-b));
			break;
			case "/": System.out.println("division  "+(a/b));
			break;
			default:System.out.println("invalid data");
		}
		
	}

}
