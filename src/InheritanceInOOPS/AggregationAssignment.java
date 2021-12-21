package InheritanceInOOPS;
class Staff							//To analyse aggregation
{
	String name="Chethan";			//Every staff has details
	String Id="EP16C";
	String Designation="Mechnaical Hod";
	public void provide()
	{
		System.out.println("Name ="+name+" ,"+"Id ="+Id+" ,"+"Designation ="+" "+Designation);
	}
	
}
class College 						//Every college has a staff
{
	String collegename="East Point College of Engineering And Technology ";
	public void nameOfCollege()
	{
		System.out.println("College Name ="+" "+collegename);
		Staff s=new Staff();
		s.provide();
	}
	
}
public class AggregationAssignment
{

	public static void main(String[] args) 
	{

		College pi=new College();		//creating object
		pi.nameOfCollege();

	}

}

