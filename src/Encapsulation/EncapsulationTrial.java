package Encapsulation;

class EncapsulationTrial
{
	private int num;
	private String name;
	
	public void setId() 
	{
		name="chethan";
		num=20;
		
		System.out.println(name);
		System.out.println(num);
	}

	public static void main(String[] args)
	{
		
		EncapsulationTrial get=new  EncapsulationTrial();
		get.setId();
	}

}
