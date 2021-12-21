package interfaceExamples;
interface Me 				//Example to understand interface 
{
	public void main();			//interface class can have only abstract methods in it and static variables 
	void mainOne();				//The methods u declare here has to be present in the sub classes

	static String one="you";
}
public  class InterfaceOne implements Me	//class sub implementing super class
{

	@Override
	public void main() 					//method one should be same has the super class 
	{									//abstract method
		
		System.out.println(one);
		
	}

	@Override
	public void mainOne()				//method two should be same has the super class abstract method
	{
		String two="And Me";
		System.out.println(two);
		
	}
	public void mainTwo()
	{
		
		String three="Shall go to party";
		System.out.println(three);
	}
	static String initial="This Weekend";
	public static void main(String[] args) 
	{
		System.out.println(initial);
		InterfaceOne doo=new InterfaceOne();		//using one object we can access all the data
		doo.main();
		doo.mainOne();
		doo.mainTwo();
		
	}

}
