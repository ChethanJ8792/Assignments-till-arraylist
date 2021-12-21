package OOPS;
class Rectangle		//Copy Constructor
{
	int length;
	int breadth;
	Rectangle(int l,int b)		//declaring variables
	{
		length=l;
		breadth=b;
	}
	Rectangle(Rectangle r)		//Copying the states to Rectangle(Object type)
	{
		length=r.length;
		breadth=r.breadth;
	}
	public void display()		//Using method printing length and breadth
	{
		System.out.println("length"+" = "+length);
		System.out.println("Breadth"+" = "+breadth);
	}
}
public class CopyConstructor
{

	public static void main(String[] args)
	{
		Rectangle rr=new Rectangle(10,20);		//creating object1 
		Rectangle rrr=new Rectangle(30,40);		//object 2
		Rectangle rrs=new Rectangle(rr);		//copying object 1 reference to object 3
		Rectangle rrd=new Rectangle(rrr);		//copying object 2 reference to 4
		rr.display();							//Hence copying of the constructor is done 
		rrr.display();							//By calling the methods we get the  output
		rrs.display();
		rrd.display();
		

	}

}
