package Arrays;
import java.util.Arrays;
public class ArraySeven {       		//program to concatenate integers using arrays

	public static void main(String[] args) 
	{
		int [] Array= {1,2,3};
		int [] ArrayTwo= {4,5,6};
		int [] ArrayThree= {7,8,9};
		int length=Array.length+ArrayTwo.length+ArrayThree.length;
		int []res=new int[length];
		int position=0;
		for(int element:Array)
		{
			res[position]=element;
			position++;
			
		}
		for(int element:ArrayTwo)
		{
			res[position]=element;
			position++;
		}
		for(int element:ArrayThree)
		{
			res[position]=element;
			position++;
		}
		System.out.println(Arrays.toString(res));
	}
}
		