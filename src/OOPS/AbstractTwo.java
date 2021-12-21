package OOPS;
abstract class  Bird
{
	public abstract void Flying();
}
 
 class Pigeon extends Bird
 {
	 @Override
	 public void Flying()
	 {
		System.out.println("Pigeon is Flying"); 
	 }
	 public void Eating()
	 {
		 System.out.println("Pigeon is Eating");
	 }
	 public void Sleeping()
	 {
		 System.out.println("Pigeon is sleeping");
	 }
 }

public class AbstractTwo {

	public static void main(String[] args) {
		Pigeon behaviours=new Pigeon();
		behaviours.Flying();
		behaviours.Eating();
		behaviours.Sleeping();
		

	}

}
