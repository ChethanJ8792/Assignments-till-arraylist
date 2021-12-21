package javaLoops;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) 		//program to reverse string
	{
		Scanner reverse=new Scanner(System.in);
		System.out.println("Enter string to reverse");//taking input from console
		String reversed=reverse.nextLine();
		//typing input here
		reverse.close();
		for(int i=reversed.length()-1;i>=0;i--) //implementing for loop
		{
			System.out.print(reversed.charAt(i));
		}

	}

}
