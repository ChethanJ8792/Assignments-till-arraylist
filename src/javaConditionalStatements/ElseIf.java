package javaConditionalStatements;
import java.util.Scanner;
public class ElseIf {

	public static void main(String[] args) 
	{
		Scanner ssc=new Scanner(System.in);
		System.out.println("Enter population ");
		int num=ssc.nextInt();
		ssc.close();
		if(num>10000)
		{
			System.out.println("city population is large");
		}
		else if(num<10000)
		{
			System.out.println("city population is less");
		}
		else
		{
			System.out.println(" both cities have equal population");
		}
		

	}

}
