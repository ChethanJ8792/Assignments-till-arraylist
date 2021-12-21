package OOPS;
abstract class Animal						//making class abstract
{
	public abstract void sound();
	
	public void Domestic()
	{
		System.out.println("All below are domestic animals");
	}
}
class Dog extends Animal					//using keyword extends making implementations 
{	
	@Override										//inherit from super class
	public void sound()						//Should create same method has abstract class
	{
		System.out.println("Dog Barks Bow Bow");
	}
}
class Cow extends Animal
{
	@Override
	public void sound()
	{
		super.Domestic();
		System.out.println("Cow sounds Ambooooooooooo");
	}
}
public class Abstraction_one {

	public static void main(String[] args)
	{
		Dog makes=new Dog();					//object of required class is created
		Cow sounds=new Cow();
		sounds.sound();
		makes.sound();
	
	}

}
