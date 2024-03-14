package oopscocept;
class monkey
{
public void jump()
{
System.out.println("jump");	
}
public void bite()
{
	System.out.println("bite");
}

}
interface basicanimal
{
void cat();
void sleep();

}
class human extends monkey implements basicanimal
{
public void speak()
{
System.out.println("speak");	
}

@Override
public void cat() 
{
System.out.println("cat");	
	
}

@Override
public void sleep()
{
System.out.println("sleeping");	
	
}


}




public class Interface2 {

	public static void main(String[] args) {
		human h=new human();
		h.cat();
		h.sleep();
		h.bite();
		h.jump();
		h.speak();
		
		
	}

}
