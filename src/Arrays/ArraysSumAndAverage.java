package Arrays;
import java.util.Scanner;
public class ArraysSumAndAverage {
//program to find the sum and average of the given numbers
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);//creating scanner object 
		System.out.println("enter the number(or length) to print sum and average:");
		int abc=scn.nextInt();		//taking input from user
		int sum=0;					//declaring one variable for sum
		double averages;				//declaring one variable for average
		int[] jkl={abc};			//declaring array
		for(int i=0;i<abc;i++)
		{
			System.out.print("");
			int values=scn.nextInt();
			sum+=values;
		
		}
		System.out.println(sum);
		System.out.println(averages=sum/abc);
		scn.close();
	}
}

	
	



