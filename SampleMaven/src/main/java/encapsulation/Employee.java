package encapsulation;

public class Employee {
	private String name,desig;
	private int salary;
	
	
	public void setter(String name,String desig,int salary)
	{
		this.name=name;
		this.desig=desig;
		this.salary=salary;
	
	}
	public void getter()
	{
		System.out.println("Name: "+name);
		System.out.println("Designation: "+desig);
		System.out.println("Salary: "+salary);
	}
	

}
