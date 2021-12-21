package OOPS;
									//constructors analyse
class BankApllicationFilling
{
	String Name;					//initializing the states
	int AadharNo;
	int DOB;
	String Address;
	String PanNo;
	
	
	BankApllicationFilling()		//implementing constructor
	{
		Name="Chethan";				//Assigning values
		AadharNo=6476645;
		DOB=1998;
		Address="KGF";
		PanNo="BR97497OII";
		
		System.out.println("Name"+" " +Name);
		System.out.println("AadharNo"+" "+AadharNo);
		System.out.println("DOB"+" "+DOB);
		System.out.println("Address"+" "+Address);
		System.out.println("PanNo"+" "+PanNo);
	}
	
}

public class ConstructorsExampleOne 
{
	public static void main(String[] args) 
	{
		new BankApllicationFilling();		//calling using new keyword in main method

	}

}
