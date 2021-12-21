package javaConditionalStatements;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args)
	{
		Scanner ssc=new Scanner(System.in);
		System.out.println("Enter Number:");//Givig console input
		int great=ssc.nextInt();//first input
		int greater=ssc.nextInt();//second input
		int greatest=ssc.nextInt();//third input
		ssc.close();
		if(great>greater&&great>greatest)//compare and check condition
		{
			System.out.println("Is the greatest number:"+great);
		}
		else if(greater>great&&greater>greatest)
		{
			System.out.println("Is the gratest number:"+greater);
		}
		else if(greatest>great&& greatest>greater)
		{
			System.out.println(" Is the gratest number:"+greatest);
		}
		

	}

}
