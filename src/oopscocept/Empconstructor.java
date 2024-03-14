package oopscocept;

public class Empconstructor {
	
	int empid;
	int salary;
	String designation;
	
	public Empconstructor()
	{
	empid=4;
	salary=50000;
	designation="tester";
		
		
	}

	public static void main(String[] args) 
	{
		Empconstructor emp=new Empconstructor();
			System.out.println("empid="+emp.empid)	;
			System.out.println("salary="+emp.salary);
			System.out.println("designation="+emp.designation);

	}

}
