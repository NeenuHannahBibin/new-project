package Practicequestions;
class person
{
	String name;
	int age;
	public person(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public String getname()
	{
		return name;
		
		
	}
	public int getage()
	{
		return age;
		
		
	}
}

public class CONSTRUCTOR {

	public static void main(String[] args) {
		person p=new person("neenu", 30);
		person next=new person("bibin", 30);
		System.out.println("name ="+p.getname());
		System.out.println("age ="+p.getage());
		System.out.println("name ="+next.getname()+"  and  age ="+next.getage());

	}

}
