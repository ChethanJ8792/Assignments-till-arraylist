package methodOverloading;
class Personal						//Example of method Overloading
{
	static String eman="My Girl Friend";
	public static void dating()     //method one
	{
		System.out.println(eman);
	}
	public void dating(String emman)
	{ 
		System.out.println(emman);
	}
	public void dating(String next,String then,String make)
	{
		System.out.println(next);
		System.out.println(then);
		System.out.println(make);
	}
}

public class MethodOverloadingOne
{

	public static void main(String[] args)
	{
		
		Personal.dating();					//calling the static state(or)static method
		Personal relation=new Personal();
		relation.dating("Name ");
		relation.dating("Will Be","Hidden To My Wife until","We Make Kids");

	}

}
