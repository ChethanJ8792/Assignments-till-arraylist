package methodOverRiding;
class Mechanical		//override example
{

	public void Struggles()			//method one 
	{
		System.out.println("Mechanical Engineer Struggles");
		System.out.println("To Learn java Initially");
		System.out.println("He will rock if learns");
	}
}
class Computer extends Mechanical			
{
	@Override
	public void Struggles()				//method two overriding
	{
		System.out.println("CS Feels he can do anything Intitially");
		System.out.println("Commits to Byheart");
		System.out.println("In learning Java");
	}
}
class MECHCS extends Mechanical
{
	@Override
	public void Struggles()			//method three overriding 
	{
		System.out.println("Mechanical Guy Enters It After Learning Java");
		System.out.println("Mech Rocks IT Shocks");
		
	}
}
public class MethodOverridingOne
{

	public static void main(String[] args) 
	{
		Mechanical ME=new Mechanical();			// accessing all the classes by using objects 
		ME.Struggles();
		Computer CS=new Computer();
		CS.Struggles();
		MECHCS MC=new MECHCS();
		MC.Struggles();

	}

}
