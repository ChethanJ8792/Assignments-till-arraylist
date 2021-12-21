package OOPS;
class BUS						//example to understand how constructor works
{
	 String door;				//initializing the states
	 String window;
	 String seats;
	BUS(String door,String window,String seats)		//parameretized constructor
	{
		this.door=door;								//assigning the values
		this.window=window;
		this.seats=seats;
		System.out.println("Bus Door is"+" "+door);
		System.out.println("Bus Window is"+" "+window);
		System.out.println("Bus is"+" "+seats+" "+"with all seats");
		
	}
	
}

public class ConstructorsExampleTwo
{

	public static void main(String[] args)
	{
		new BUS("Open","Open","Filled");			//using new keyword which helps to call 
													//constructor whenever used
	}

}
