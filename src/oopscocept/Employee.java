package oopscocept;

public class Employee {
	int empid;
	int deptno;
	int salary;
	String empname;
	
	
	public void display()
	{
	System.out.println(empid);
	System.out.println(deptno);
	System.out.println(salary);
	System.out.println(empname);
		
	}
	

	public static void main(String[] args)
	{
Employee ob1=new Employee();
ob1.empid=101;
ob1.deptno=20;
ob1.salary=50000;
ob1.empname="neenu";
ob1.display();

		
		
		
	}	
		
	}

	
