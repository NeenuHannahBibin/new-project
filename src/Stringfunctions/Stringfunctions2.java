package Stringfunctions;

public class Stringfunctions2 {

	public static void main(String[] args) {
		
		
		// java pgm to concatenate given strings
				/*String s="jmeter ";
				String s1="performance testing tool";
				System.out.println(s.concat(s1)); */
		
		
			// check language contains
				/* String str="java language is platform independent";
				//System.out.println(str.contains("language"));
				if(str.contains("language"))
				{
					System.out.println("pass");
					
				} 
				else
				{
				
				System.out.println(" fail");
				}
				
				*/
						
		
		//"web application" present

	String s3="selenium webdriver is used for webapplication testing ";
	String str[]=s3.split(" ");
	
	for(String s:str)
	{
		
		System.out.println(s);
		if(s.contains("webapplication"))
		{
			
			break;
		}
		
		
		/*if(s.contains("webapplication"))//s.equals or s.contains
		{
		break;	
			
		}
		else
		{
			
			System.out.println(s);
		}
		*/
	}
		
	
	}
		
	
		
	}
	


