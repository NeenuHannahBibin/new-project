package oopscocept;

public class Parametercons {
	int empid;
	int salary;
	String designation;
	
	/*public Parametercons(int id,int sal,String desig)
	{
	empid=id;
	salary=sal;
	designation=desig;
		
		
	}*/
	public Parametercons(int empid,int salary,String designation)
	{
	this.empid=empid;
	this.salary=salary;
	this.designation=designation;
	}
	public void dispaly()
	{
		System.out.println("empid="+empid);
		System.out.println("salary="+salary);
		System.out.println("designation="+designation);
		
	}

	public static void main(String[] args)
	{
		Parametercons emp=new Parametercons(11, 50000, "tester");
		emp.dispaly();
		/*System.out.println("empid="+emp.empid);
		System.out.println("salary="+emp.salary);
		System.out.println("designation="+emp.designation);*/
		
		
		
	}

}
