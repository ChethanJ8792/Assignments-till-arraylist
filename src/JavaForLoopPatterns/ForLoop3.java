package JavaForLoopPatterns;
import java.util.Scanner;
public class ForLoop3 {

	public static void main(String[] args) 
	{
		Scanner trial=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int real=trial.nextInt();
		int a=1;
		for(int i=1;i<=real;i++)
		{
			for(int j=1;j<=real;j++)
			{
				System.out.print(i+" "+j);
				if(a%3==0)
					break; 
			}
			System.out.println(" ");
		}
		trial.close();
	}

}
