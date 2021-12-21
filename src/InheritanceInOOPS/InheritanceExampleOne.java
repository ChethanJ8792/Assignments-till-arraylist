package InheritanceInOOPS;

class CapGemini			//program to understand inheritance concept
{
	String name="chethan";
	String designation="Analyst";
	String Offered="15lakhs/Annum";
	public void Domain()
	{
		System.out.println("React with J2EE");
		System.out.println(" ");
	}
	
}
class EmployeeDetails extends CapGemini		//this class extending above class which mean 
{											//properties are inherited to this class from super class
	public void Java()
	{
		super.Domain();
		System.out.println("Name"+" = "+name);
		System.out.println("Designation"+" = "+designation);
		System.out.println("Offered"+" = "+Offered);
		
	}
}

public class InheritanceExampleOne
{

	public static void main(String[] args)
	{
		EmployeeDetails outer=new EmployeeDetails(); 		//accessing methods by using objects
		outer.Java();
		

	}

}
