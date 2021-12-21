package polymorphism;
class Computer			// polymorphism  means same method showing d/f behaviour
{						//compile time polymorphism means we can predict the o/p while compile time itself
	public void Computers()		//So this is CTP
	{							//best example for CTP is method overloading bcz we can predict the o/p 
		System.out.println("My Computer helps in browsing");
	}
	public void Computers(String S)	
	{
		System.out.println(S);
	}
	public void Computers(int memory)
	{
		System.out.println("My Computer has an memory of "+" = "+memory+"GB");
	}
}
public class CompileTimePolymorphism
{

	public static void main(String[] args) 
	{
		Computer config=new Computer();		//By creating an object we are calling the above classes
		config.Computers();
		config.Computers("My Computer Helps in making video call");
		config.Computers(476);

	}

}
