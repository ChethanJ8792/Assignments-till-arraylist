package Encapsulation;
class Student
{							//Example of encapsulation from jspiders
	private int id;
	private String name;	//making the members private
	public void setid(int k)
	{
		if(k<1||k>50)
		{
			System.out.println("Invalid id");
		}
		else
		{
			id=k;
		}
		
	}
	public int getid()
	{
		return id;
	}
	public void setName(String n)
	{
		n=name;
	}
	public String getName()
	{
		return "chethan";
	}
	
}
public class ExampleFromJsp 
{

	public static void main(String[] args)
	{
		Student s=new Student();
		s.setid(25);
		//s.setName("chethan");
		System.out.println(s.getid());
		System.out.println(s.getName());

	}

}
