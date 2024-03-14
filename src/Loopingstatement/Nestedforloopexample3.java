package Loopingstatement;

public class Nestedforloopexample3 {

	public static void main(String[] args) {
		
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 
		 */
/*  for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+ " ")	;

}
System.out.println();
}  */
int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(n+" ");
				n=n+1;// n++
				}
						
			System.out.println();
			
		}

	}

}
