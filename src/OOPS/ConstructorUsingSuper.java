package OOPS;
class Parent					//program to understand constructor chaining
{
	Parent()					//constructor in super class
	{
		System.out.println("This is a parent constructor");
	}
}
class Child extends Parent		//sub class  extending super class
{
	Child()						//constructor in sub class
	{
		System.out.println("This is child default constructor");
	}
	Child(Boolean show)			//parameritized constructor
	{
		System.out.println("This is a parameritized constructor:which resulted in giving birth to 4 kids");
	}
	public void main()			//this is a method
	{
		System.out.println("This is Out of constructor chaining after marriage");
	}
}

public class ConstructorUsingSuper		//main class
{

	public static void main(String[] args) 		
	{
		Child kids=new Child();			//object for sub class default constructor
		kids.main();
		new Child(true);				//object for sub class parameritized constructor

	}

}
