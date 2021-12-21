package javaConditionalStatements;
import java.util.Scanner;
public class CubeArea
	{

	public static void main(String[] args)
	{										//finding the area of a cube
		Scanner cube=new Scanner(System.in);
		System.out.println("Enter the number of edges to find the area of cube");
		int edge=cube.nextInt();
		int num=6;  						//declaring constant 6
		cube.close();
		int area=num*(edge*edge);			//formula to find area of a cube
		System.out.println(area);			//printing area
	}

}
