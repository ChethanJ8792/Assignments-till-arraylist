package Assignment;
import java.util.Scanner;
public class AssignmentOperatorDynamic
{
//program to know operation of assignment operators
	public static void main(String[] args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter num to perform Assignment Operations");
		int me=r.nextInt();
		int cs=1;
		r.close();
		System.out.println(cs+=me);
		System.out.println(cs*=me);
		System.out.println(cs-=me);
		System.out.println(cs/=me);
		System.out.println(cs%=me);
		

	}

}
