package JavaForLoopPatterns;

public class ForLoop4 {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50,60};
		int sum=0;
		double average;
		for(int result:a)
		{
			sum+=result;
			
		}
		System.out.println(sum);
		average=sum/a.length;
		System.out.println(average);
	}

}
