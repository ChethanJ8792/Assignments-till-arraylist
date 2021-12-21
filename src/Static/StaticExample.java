package Static;
class Example_one
{
	static void staticmethod()					//static method
	{
		System.out.println("static method implemented");
	}
	public static int staticmethod_two()		//static method two
	{
	
		System.out.println("implemented");
		return 100;
		
	}
}

public class StaticExample {

	public static void main(String[] args)
	{
		Example_one.staticmethod();			//no object needed
		Example_one.staticmethod_two();

	}

}
