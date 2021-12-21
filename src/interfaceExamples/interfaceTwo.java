package interfaceExamples;
public interface interfaceTwo 
{
	public static void give()
	{
		System.out.println("Im the interface im the rule maker ");
	}
}
public class A implements interfaceTwo 
{
	public static void give()
	{
		System.out.println("Im the first child class of interface");
	}
}
public  class B implements interfaceTwo 
 {
	 public static int  main()
	 {
		 return 10;
	 }
 }
 public class Result
 {
	 public static void main(String[]args)
	 {
	
		B.main();
	 }
 }
