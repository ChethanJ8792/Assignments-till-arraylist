package javaLoops;
import java.util.Scanner;
public class TablesUsingWhileLoop
{

	public static void main(String[] args) 
	{
	Scanner Tables=new Scanner(System.in);
	System.out.println("Enter which table you want");
	int multiply=Tables.nextInt();
	int i=1;
	while(multiply>1)
	{
		
				int result=(multiply*i);
				if(i>=10)
				{
					break;
				}
				
	System.out.println(multiply+"*"+i+" = "+result);
	i++;
	}
	Tables.close();
	}

}
