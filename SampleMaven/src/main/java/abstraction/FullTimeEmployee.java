package abstraction;

public class FullTimeEmployee extends Employee{
	public void calculateSalary()
	{
		int sal=basicsal*8*30;
		System.out.println("Salary of full time employee is "+sal);
	}
	public static void main(String args[])
	{
		FullTimeEmployee obj=new FullTimeEmployee();
		System.out.println("Full time Employee");
		obj.cal();
		obj.calculateSalary();
		System.out.println("Contract Employee");
		Contractor obj1=new Contractor();
		obj1.cal();
		obj1.calculateSalary();
	
		
		
		
	}
}
