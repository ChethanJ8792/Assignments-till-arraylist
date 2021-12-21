package accessModifiers;

class SquareOfNum				//private access modifier can be accessed only within a class 
{
	private int num;
	private int square;
	public void setNum(int num)
	{
		this.num=num;				//by creating setter and getter public methsods
	}
	public int getNum()
	{
		return num;
	}
	public void setSquare(int square)
	{
		this.square=square;
	}
	public int getSquare()
	{
		int square=num*num;
		return square;
	}
}
public class PrivateClass {

	public static void main(String[] args) 
	{
		SquareOfNum son=new SquareOfNum();	//creating an object and calling tyhe methods
		son.setNum(10);
		son.setSquare(12);
		System.out.println(son.getNum());
		System.out.println(son.getSquare());

	}

}
