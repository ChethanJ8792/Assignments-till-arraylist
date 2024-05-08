package Arrays;


public class ArrayOne {

	public static void main(String[] args) 
	{
		int[] one= {1,2,3,4,5,6};       // declare array
		System.out.print((one[0])+" ");
		System.out.print(one[1]+" ");
		System.out.print(one[2]+" ");
		System.out.print(one[3]+" ");
		System.out.print(one[4]+" ");
		System.out.println(one[5]+" ");
		System.out.println("without using for loop^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");//after copying
		int[] two=one;
		for(int three:two)				//using for each loop 
		{
		
		System.out.println("after copying we get is this"+" "+three); //copying the array
		}
		

	}
}
