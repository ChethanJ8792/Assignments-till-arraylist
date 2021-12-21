package javaConditionalStatements;
import java.util.Scanner;
public class ifElse {
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();
		s.close();
		if(number>=0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
	}

}
