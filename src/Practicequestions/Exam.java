package Practicequestions;

class Student
{
public void mark()
{
	System.out.println("mark");
}
public void showdetails()
{
	
	System.out.println("details");

}
}
interface principle
{
void resign();
void rejoin();

}
class teacherr extends Student implements principle
{
public void department()

{
	
	System.out.println("department");
	}

@Override
public void resign() {
	System.out.println("resign");
	
}

@Override
public void rejoin() {
	System.out.println("rejoin");
	
}

	
}



	



public class Exam {

	public static void main(String[] args) {
		
		teacherr t=new teacherr();
		t.mark();
		t.showdetails();
		t.department();
		t.resign();
		t.rejoin();

	}

}
