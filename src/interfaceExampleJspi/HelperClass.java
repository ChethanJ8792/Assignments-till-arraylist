package interfaceExampleJspi;
public class HelperClass
{
	public static Car getCar(String s)
	{
		if(s.equalsIgnoreCase("Audi"))
		{
			Audi a=new Audi();
			return a;
		}
		else if(s.equalsIgnoreCase("Nano"))
		{
			Nano n=new Nano();
			return n;
		}
		else
		{
			System.out.println("Null");
		}
		return null;
	}
}

	

