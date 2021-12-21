package JavaForLoopPatterns;
import java.util.Scanner;
public class ForLoop1 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);			//scanner object
		System.out.println("Enter no. of rows");	//console asking for input
		int n=scn.nextInt();						//input is of integer type
		scn.close();
		for(int i=0;i<=n;i++)						//implementing for loop
		{
			for(int j=0;j<=i;j++)					//by using nested for loop
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		scn.close();
	
	}

}
