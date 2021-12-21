package javaConditionalStatements;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check");
		int num=sc.nextInt();
		sc.close();
		if
		(num%2==0)
		{
			System.out.println("its a even" );
		}
		else
		{
			System.out.println("its a odd");
		}

	}

}
