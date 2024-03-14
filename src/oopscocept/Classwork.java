package oopscocept;

class Members
{
String name;
int age;
String address;
int salary;
public void printdetails()
{
//System.out.println("the details of member");
System.out.println("name ="+"neenu");
System.out.println("age ="+40);
System.out.println("salary ="+50000);
System.out.println("address= "+"adddddrgt");




}
}
class worker extends Members
{
String specialization;


}
class manager extends Members
{
String department;	

}



public class Classwork {

	public static void main(String[] args) {
	System.out.println("the details of worker");
	worker w=new worker();
	w.specialization="astronamy";
	System.out.println("specialization "+w.specialization);

	w.printdetails();
	
	System.out.println("the details of manager");
	manager m=new manager();
	m.age=25;
	m.name="anitha";
	m.salary=40000;
	m.address="aallldkdkf";
	m.department="physics";
	System.out.println("department "+m.department);
	m.printdetails();
	
	
	
	
		
	}

}
