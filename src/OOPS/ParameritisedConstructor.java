package OOPS;
class Parameterized  //program to parameritized default constructor
{
	Parameterized(int packagee )
	{
		System.out.println(packagee+" "+" CrorePerAnnum");
	}
	Parameterized(String name)
	{
		System.out.println("Package offered for"+" "+name+" is ");
	}
}

public class ParameritisedConstructor {

	public static void main(String[] args)
	{
		new Parameterized("Chethan");  //creating object of constructor
		new Parameterized(2);

	}

}
