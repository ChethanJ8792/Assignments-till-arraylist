package Static;
public class StaticMethods 
{
	static int chargingPercentage=80;
	static String Phone="OnePlus";
	static int chargeLeft=40;
	static String Phone_two="Redmi";
	static
	{
		System.out.println("This is a static method");
		System.out.println("PhoneType"+" = "+Phone+" , "+"ChargeLeft"+" = "+chargingPercentage+"%");
	}
	static 
	{
		System.out.println("This is also static method");
		System.out.println("PhoneType"+" = "+Phone_two+" ,  "+"ChargeLeft"+" = "+chargeLeft+"%");
	}
	public static void main(String[] args)
	{
	}

}
