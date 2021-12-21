package accessModifiers;
							//Final data members once final keyword is used 
public class FinalKeyword 	//its final value cannot be changed 
{
	final int give=10;		//assigned value 10
	public int giving()
	{
		return 20;			//rewriting it to 20 but this u wont get output
	}

	public static void main(String[] args) 
	{
		FinalKeyword fk=new FinalKeyword();	//create object and call the methods and data variables
		System.out.println(fk.give);
		
		

	}

}
