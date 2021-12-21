package methodOverloading;			//Example to analyse method overloading
class Econ
{

	public void work(String A)		//method one with same method name
	{
		System.out.println(A);
	}
	public void work(String B,String C,String D)//method two with same name d/f argument
	{
		System.out.println(B);					//implementations
		System.out.println(C);
		System.out.println(D);
	}
	public void work(String E,String F)			//method three with d/f argument than previous method
	{
		System.out.println(E);
		System.out.println(F);
		
	}
	
}
public class MethodOverloadingTwo
{

	public static void main(String[] args) 
	{
		Econ person=new Econ();			//By creating one object calling all the methods 
		person.work("Im a");				//with object reference
		person.work("Software Engineer","Working In","CapGemini");
		person.work("With Package of","50LPA");
		

	}

}
