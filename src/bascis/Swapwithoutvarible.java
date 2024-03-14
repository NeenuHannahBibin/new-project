package bascis;

public class Swapwithoutvarible {

	public static void main(String[] args) {
		int a=25;
		int b=23;
	
		System.out.println(" Before swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("after swap");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
