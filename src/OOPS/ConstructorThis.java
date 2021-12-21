package OOPS;
class Data
{							//program to print all the details of a student
	String name;			//assigning variables to store data
	String branch;
	String usn;
	String section;
	int yop;
	int age;
	long contactno;
	String address;

	Data(String name,String branch,String usn,String section,int yop,int age,long contactno,String address)
	{
		this.name=name;
		this.branch=branch;
		this.usn=usn;
		this.section=section;
		this.yop=yop;
		this.age=age;
		this.contactno=contactno;
		this.address=address;					
		System.out.println("Name"+"="+name+" , "+"Branch"+"="+branch+" , "+"USN"+"="+usn+" , "+"Section"+"="+section);
		System.out.println("YOP"+"="+yop+" , "+"Age"+"="+age+" , "+"ContactNo"+"="+contactno+"0"+" , "+"Address"+"="+address );
		//student data will be print here
	}
	

	
}

public class ConstructorThis {

	public static void main(String[] args) 			
	{
		new Data("Chethan","RoyalMechanical","1EP16ME022","A",2020,23,879249747,"Kolar");
		//creating an object to print data of a student 
	}

}
