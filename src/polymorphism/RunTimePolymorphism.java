package polymorphism;
//Runtime polymorphism(RTP) means we can't predict the o/p until the program is made run
//best example for RTP is methodOveerriden 
//same method d/f implementations
import java.util.Scanner;
class Computerr
{
	public void shows()			//method one
	{
		System.out.println("Computer shows calling behaviour");
	}
}
class ComputerTwo extends Computerr
{
	@Override
	public void shows()		    //method sub class overrides super class
	{
		System.out.println("Computer shows browsing behaviour");
	}
}
class ComputerThree extends Computerr
{
	@Override
	public void shows()			//method two sub class overriding the super class
	{
		System.out.println("Computer helps in making video call");
	}
}



public class RunTimePolymorphism	
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);	//taking input from user
		System.out.println("Enter 1 for calling , Enter 2 for browsing , Enter any no. for video call ");
		int input=scn.nextInt();			//input received should be integer value
		Computerr get=null;
		if(input==1)						//by putting a condition one
		{
			get=new Computerr();
		}
		else if (input==2)					//by giving condition two
		{
				get=new ComputerTwo();		
		}
		else								//by giving third condition
		{
			get=new ComputerThree();
			
		}
		get.shows();						//calling all the methods using same method name
		scn.close();
	}

}
