package exceptions;

public class ExampleOne 
{

	public static void main(String[] args)
	{
		System.out.println("a");
		System.out.println("b");
		System.out.println(100/0);
		System.out.println("c");
		try {
			System.out.println("number/0 cannot be divided");
		}catch(Exception e)
		{
			System.out.println(100/0);
		}
	}

}
