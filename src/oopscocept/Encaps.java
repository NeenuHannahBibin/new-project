package oopscocept;
class encap
{
private String name;
private String designation;
public String getName()
{
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}


}

public class Encaps {

	public static void main(String[] args)
	{
encap en=new encap();
en.setName("neenu");
System.out.println("the name is "+en.getName());
en.setDesignation("Software tester");
System.out.println("the designation is "+en.getDesignation());
	}

}
