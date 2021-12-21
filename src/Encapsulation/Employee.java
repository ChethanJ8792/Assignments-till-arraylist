package Encapsulation;
class Emp
{								//Example to analyse Encapsulation
	private String empName;		//describing all employee details by making them private
	private int empId;
	private double salary;
	private String desig;
	private String email;
	public String getEmpName() {		//getter and setter methods for all states
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
public class Employee
{

	public static void main(String[] args)
	{
		Emp e=new Emp();			//by creating an object calling all the methods of getter and setter
		e.setEmpName("chethan");
		e.setEmpId(561115);
		e.setEmail("chethan2jsr4@gmail.com");
		e.setDesig("data analyst");
		e.setSalary(1000000.0);
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpId());
		System.out.println(e.getEmail());
		System.out.println(e.getDesig());
		System.out.println(e.getSalary());
	}

}
