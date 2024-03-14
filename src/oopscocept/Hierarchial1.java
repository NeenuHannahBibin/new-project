package oopscocept;


	
	
	class Banking
	{
	public void 	withdraw()
	{
		
		System.out.println("withdraw");
		
	}
	public void deposit()
	{
	System.out.println("deposit");	
		
	}
		
	}
	class Sbi extends Banking
	{
	public void sbiinterest()
	{
		
	System.out.println("sbi interest");	
		
	}
		
	}
	class Hdfc extends Banking
	{
	public void hdfcloan()
	{
		
	System.out.println("hdfcloan");	
		
	}
		
		
	}
	public class Hierarchial1 {
	public static void main(String[] args) {
		Sbi sb= new Sbi();
		sb.deposit();
		sb.withdraw();
		sb.sbiinterest();
		Hdfc hd=new Hdfc();
		hd.deposit();
		hd.withdraw();
		hd.hdfcloan();

	}

}
