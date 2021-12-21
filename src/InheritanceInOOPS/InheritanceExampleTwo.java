package InheritanceInOOPS;
class Bag
{
	int i;
	public void Properties()
	{
		System.out.println("Bag has below properties");
	}
}
class Zip extends Bag
{
	
	public  void Properties()
	{
		System.out.println("Bag has a zip" );
	}
}
class Pocket extends Bag
{
	public void Properties()
	{
		System.out.println("Bag has Pocket");
	}
}

public class InheritanceExampleTwo {

	public static void main(String[] args) 
	{
		Pocket Hp=new Pocket();
		Hp.Properties();
		Hp.i=10000;
		System.out.println("And it has Rs"+Hp.i);
	}

}
