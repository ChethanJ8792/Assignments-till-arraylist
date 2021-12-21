package OOPS;
class DefaultCons
{								//program to analyse default constructor
	String laptop="HP";
	int price=60000;
	String configurations="476GB space high video quality";
	DefaultCons()					//implementing constructor
	{
		
		 System.out.println("My laptop is of "+" = "+laptop+"Brand");
		 System.out.println("price"+" = "+price); 
		 System.out.println("Congigurations"+ " = "+configurations); //obtaining final results of a laptop
	}

}

public class DefaultConstructor {

	public static void main(String[] args)
	{
	
		new DefaultCons();			//calling using constructor object
		
	}

}
