package OOPS;
class Details
{
	String name;
	String language;
	String city;
	String State;
	
	
	Details()
	{
		
		 name="chethan";
		 language="phython";
		 city="Banglore";
	     State="Karnataka";
		
		
	}
}

public class Constructor {

	public static void main(String[] args)
	{
		Details result=new Details();
		System.out.println(result.name);
		System.out.println(result.language);
		System.out.println(result.city);
		System.out.println(result.State);
		

	}

}
