package Assignment;
import java.util.Scanner;
public class DecrementOperatorDynamic
{

	public static void main(String[] args) 
	{
		Scanner paper=new Scanner(System.in);
		System.out.println("Enter number to decrement");
	    int dec=paper.nextInt();
	    paper.close();
	    System.out.println(--dec);
	    System.out.println(dec--);
	    System.out.println(dec--);
	    System.out.println(--dec);

	}

}
