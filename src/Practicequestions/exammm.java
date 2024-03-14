package Practicequestions;

class Classroom
{
	
int rollnumber;
String name;
int mark;
public void store(int rollnumber,String name,int mark)
{
	 this.rollnumber = rollnumber;
	 this.name=name;
	this. mark=mark;
	
}
public void display()
{
	System.out.println("rollnumber  ="+rollnumber);
	System.out.println("name  ="+name);
	System.out.println("mark  ="+mark);

}

}



public class exammm {

	public static void main(String[] args) {
		Classroom c=new Classroom();
		c.store(11,"neenu", 50);
		c.display();

	}

}
