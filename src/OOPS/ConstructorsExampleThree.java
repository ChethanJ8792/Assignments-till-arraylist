package OOPS;
class Order
{
	String name="Myself";
	String Pizza="Infinity";			//initializing and declaring the values
	String Beverage="AllType";
	String iceCream="AmulBabyIcream";
	int totalPrice;
	Order()								//default constructor
	{
		System.out.println("Name"+"  "+name);
		System.out.println("NoOfPizzas"+"  "+Pizza);
		System.out.println("Beverage"+"  "+Beverage);
		System.out.println("IceCream"+"  "+iceCream);
	
	}
	Order(int totalPrice)				//implementing parameretized constructor
    {
		System.out.println("Total Bill = "+totalPrice );
	
	}
	
}

public class ConstructorsExampleThree
{
	

	public static void main(String[] args)
	{
		new Order();						//calling both parameretized and default constructor
		new Order(10500 );
		System.out.println("ThankYou Visit Again!!!!");

	}

}
