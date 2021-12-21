package JavaForLoopPatterns;
public class ForLoop5 {

	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
				if(j!=1)
				{
					System.out.print("*");
				}
			
			}
			System.out.println();
			
		}

	}

}
