package javaConditionalStatements;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) 
	{
		Scanner days=new Scanner(System.in);
		System.out.println("Enter month");//program to fing tyhe number of days in a month
		int month=days.nextInt();
		days.close();
		switch(month)//switching statements 
		{
		case 1 :System.out.println("January month has 31 days");
		break;
		//Assigning months and days
		case 2 :System.out.println("February month has 28 days");
		break;
		case 3 :System.out.println("March month has 31 days");
		break;
		case 4 :System.out.println("April month has 30 days");
		break;
		case 5 :System.out.println("May month has 31 days");
		break;
		case 6 :System.out.println("June month has 30 days");
		break;
		case 7 :System.out.println("July month has 31 days");
		break;
		case 8 :System.out.println("August month has 31 days");
		break;
		case 9 :System.out.println("September month has 30 days");
		break;
		case 10 :System.out.println("October month has 31 days");
		break;
		case 11 :System.out.println("November month has 30 days");
		break;
		case 12 :System.out.println("December month has 31 days");
		break;
		default:System.out.println("Invalid month");
		
		
		}
		
		

	}

}
