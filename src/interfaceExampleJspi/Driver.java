package interfaceExampleJspi;
import java.util.Scanner;
public class Driver
{

	public static void main(String[] args)
	{
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter car name");
	String s=scn.next();
	Car c= HelperClass.getCar(s);
	c.start();
	c.moving();
	c.stop();
	scn.close();
	}

}
