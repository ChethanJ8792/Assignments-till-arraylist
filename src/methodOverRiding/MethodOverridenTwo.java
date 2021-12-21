package methodOverRiding;
class Company				//method overloading same method name d/f implementations
{
	public void IT()
	{
		System.out.println("Below All are IT related Companies");
	}
}
class Facebook extends Company    //class two extending to upper super class  
{
	@Override
	public void IT()
	{
		System.out.println("Facebook is a Social meida Company");
	}
}
class PhonePe extends Company
{
	@Override
	public void IT()
	{
		System.out.println("PhonePe is a Online  Netbanking Company");
	}
}
public class MethodOverridenTwo
{

	public static void main(String[] args)
	{
		
		Company two=new Company();				//creating objects for all the classes
		two.IT();
		Facebook one=new Facebook();
		one.IT();
		PhonePe service=new PhonePe();
		service.IT();

	}

}
