package Practicequestions;

class dog
{
private String name;
private String breed;
dog(String n,String b)
{
name=n;
breed=b;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getBreed() 
{
	return breed;
}
public void setBreed(String breed) 
{
	this.breed = breed;
}


}



public class Practice2 {

	public static void main(String[] args) 
	{

		dog ob=new dog("bastin","pug");
		dog d=new dog("ruby","laberdor");


		System.out.println("the old name is  "+ob.getName());
		System.out.println("the old breed is  "+ob.getBreed());
		ob.setName("basssss");		
		ob.setBreed("pug");
		System.out.println("the modified name is  "+ob.getName());
		System.out.println("the modified breed is  "+ob.getBreed());
		
		System.out.println("the old name is  "+d.getName());
		System.out.println("the old breed is  "+d.getBreed());
		d.setName("chubby");		
		d.setBreed("skdjslkdsd");
		System.out.println("the modified name is  "+d.getName());
		System.out.println("the modified breed is  "+d.getBreed());
	}

}
