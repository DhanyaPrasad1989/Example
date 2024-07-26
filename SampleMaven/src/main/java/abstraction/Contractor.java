package abstraction;
import java.util.*;
public class Contractor extends Employee{

	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the working hours for contract employee");
		int hr=sc.nextInt();
		int sal=hr*basicsal*30;
		System.out.println("Salary of contract employee is "+sal);

	}

}
