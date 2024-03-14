package oopscocept;

public class employee1 {
	int empid;
	int salary;
	String designation;
	
	/*  public void setvalues(int id,int sal,String desig)
	
	{
	empid=id;
	salary=sal;
	designation=desig;	
	}  */
	
	public void setvalues(int empid,int salary,String designation)
	{
	this.empid=empid;
	this.salary=salary;
	this.designation=designation;
		
		
	}
	public void display()
	{
	System.out.println("emplid="+empid);
	System.out.println("salary="+salary);
	System.out.println("designation="+designation);
		
	}

	public static void main(String[] args) {
		
		employee1 emp=new employee1();
		emp.setvalues(11, 50000, "tester");
		emp.display();

	}
}
