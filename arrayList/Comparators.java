package arrayList;
import java.util.Comparator;
import java.util.Arrays;
public class Comparators 
{

	public static void main(String[] args) 
	{
		String[] data= {"Jayanna","Rathnamma"};
		Comparator c=new lenCom();
		Arrays.sort(a,c);
		for(String s:a)
		{
			System.out.println(s);
		}
	}
}
class lenCom implements Comparators
{
	public int compare(Object arg1,Object arg2);
	return ((String)arg1).length()-((String)arg2).length();
}
