package JavaForLoopPatterns;
import java.util.Scanner;
public class ForLopop2 {

	public static void main(String[] args) 
	{
		Scanner trial=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int first=trial.nextInt();
		trial.close();
		for(int i=0;i<=first;i++)
		{
			for(int j=1;j<=first;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}
