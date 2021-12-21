package javaConditionalStatements;
import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) 
	{//program to find sum and average of natural numbers
	Scanner natural=new Scanner(System.in);
	System.out.println("Enter number to find average and sum ");
	int n=natural.nextInt();
	double sum=0;
	natural.close();
	for(int i=1;i<=n;i++)
	{
		sum+=i;//to find sum of numbers
	}
	    System.out.println(sum);
		System.out.println("average "+"= "+sum/n);//Finding average of natural numbers
	}

}
