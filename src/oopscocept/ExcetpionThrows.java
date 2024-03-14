package oopscocept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcetpionThrows {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
FileInputStream f=new FileInputStream("E://BOOK.XLX");
System.out.println("startde");
Thread.sleep(5000);
System.out.println("stopped");
	}

}
