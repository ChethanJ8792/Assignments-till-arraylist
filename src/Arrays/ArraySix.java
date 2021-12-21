package Arrays;
import java.util.Arrays;
public class ArraySix {

	public static void main(String[] args)
	{
		int []a= {44,66,77,88,9999,9,8};
		int []b=new int[6];
		int []c=new int[b.length];
		System.arraycopy(a,2,c,0,5);
		System.out.println(Arrays.toString(c));
	}

}
