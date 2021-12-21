package OOPS;
import java.util.Scanner;
public class CalculatorUsingMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);  //programming to make calculator
		System.out.println("enter 2 numbers to perform operation:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		CalculatorUsingMethods output=new CalculatorUsingMethods();
		
		
		output.plus(a,b);
		output.minus(a,b);
		scn.close();
	} 
	
		public void plus(int a,int b)    //method for addition
		{
		int addition=a+b;
		System.out.println("addition of numbers is"+" "+addition);
		}
		public void minus(int a,int b)	//method for subtraction
		{
		int subtraction=a-b;
		System.out.println("subtraction of numbers is"+" "+subtraction); 
		}
		public void multi(int a,int b)  //method for multiplication
		{
		int multiplication=a*b;
		System.out.println(multiplication);  
		}
		public void div(int a,int b)	//method for division
		{
		int division=a/b;
		System.out.println(division);
		}
		public void mod(int a,int b)	//method for modulus
		{
		int modulus=a%b;
		System.out.println(modulus);
		}
	
}

		 
		


