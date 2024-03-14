package Practicequestions;

class Personn
{
String name;
int age;
Personn(String n,int a)
{
name=n;
age=a;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}

public class Cons {

	public static void main(String[] args) 
	{

	Personn p1=new Personn("neenu", 30);	
	System.out.println("name is "+p1.getName()+"  "+"age is  "+p1.getAge());
	
	
	Personn p2=new Personn("bibin", 40);
	System.out.println("name is "+p2.getName()+"  "+"age is  "+p2.getAge());
	
	
	}

}
