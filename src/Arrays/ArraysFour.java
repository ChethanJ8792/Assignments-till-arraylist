package Arrays;
import java.util.Arrays;
public class ArraysFour {

	public static void main(String[] args)
	{
		ArraysFour.mainOne();

	}
		public  static void mainOne()
		{
		int []first= {25,45,5,5,4,5};
		int []second=first;
		System.out.println(Arrays.toString(second));
		int []fourth=new int [4];
		for(int i=0;i<fourth.length;i++)
		{
			fourth[i]=first[i];
		}
		System.out.println(Arrays.toString(fourth));
		}
}
			
			

