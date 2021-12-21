package OOPS;

class Television								//program to analyse methods
{
	static String condition_one="on";
	static String condition_two="off";
	public static void Using()					//method one
	{
		System.out.println("TV is Connected to Internet");
	}
	public void Channels()						//method two
	{
		System.out.println("All chanells are Playing with high clarity");
	}
	public void Switch()						//method three
	{
		System.out.println("TV is "+condition_one);
	}											
	public void SwitchOff()						//method four
	{
		System.out.println("TV is "+condition_two);
	}
}

public class MethodExampleOne {

	public static void main(String[] args)
	{
		Television asset=new Television();		//calling all methods using one object
		asset.Switch();
		Television.Using();
		asset.Channels();
		asset.SwitchOff();

	}

}
