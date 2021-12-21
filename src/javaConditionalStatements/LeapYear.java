package javaConditionalStatements;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);//creeating Scanner Object
		System.out.println("Enter a year:");//input from console
		int numb=scn.nextInt();//program to print leap year 
		scn.close();
		if
		(numb%4==0)//Assigning condition 
		{
			System.out.println("its a leap year");
		}
		else
		{
			System.out.println("its not a leap year");
		}
		
	}

}
