package javaConditionalStatements;
import java.util.Scanner;
public class RectangleArea {

	public static void main(String[] args) 
	{//program to find area of a rectangle
		Scanner rectangle=new Scanner(System.in);
		System.out.println("Enter length:");//taking input length from user
		System.out.println("Enter breadth:");//taking input breadth from user
		int len=rectangle.nextInt();
		int bre=rectangle.nextInt();
		int area;//declaring area
		rectangle.close();
		area=len*bre;//formula for area of rectangle
		System.out.println("area of a rectangle is:" + area);//printing area 
	
	}

}
