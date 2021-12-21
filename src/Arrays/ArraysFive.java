package Arrays;
import java.util.Arrays;
public class ArraysFive {

	public static void main(String[] args) 
	{
		int []chethan= {1,4,3,1,4,3,1,4,3};
		int []spoorthi=new int[8];
		for(int i=0;i<spoorthi.length;i++)
		spoorthi[4]=chethan[5];
		System.out.println(Arrays.toString(chethan));
		System.out.println("after copying to spoorthi");
		System.out.println(Arrays.toString(spoorthi));
		

	}

}
