package InheritanceInOOPS;
class Address
{		//Example to understand aggregation(has a relation
	String adre="Abc";
	String add="bcc";
	String dd="bbb";
	String d="ccc";
	Address()
	{
	
		System.out.println("AddressOne"+"  "+adre);
		
	}
	Address(String addT)
	{
		System.out.println(addT);;
	}
}
class Student				//student has a relation with address
{
	Student(String s)
	{
		new Address();
		new Address("Address two");
	}
}

public class AggregationAssignmentTwo
{

	public static void main(String[] args)
	{
		new Student("chethan");			//just by using new keyword we can be able to access constructors

	}

}
