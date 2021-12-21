package javaConditionalStatements;
import java.util.Scanner;
public class MultiplicationTable
{

	public static void main(String[] args) 						//program to print tables
	{
		Scanner table=new Scanner(System.in);
		System.out.println("Enter which table to print");		
		int multiply=table.nextInt();							//Assigning table number 
		table.close();
		for(int i=1;i<=10;i++)									//using for loop intitializing,conditioning and updation
		{
			System.out.println(multiply+"*"+i+"="+multiply*i);	//printing the tables
		
		}
		
	}

}
