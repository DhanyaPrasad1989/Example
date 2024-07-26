package abstraction;

import java.util.Scanner;

public abstract class Employee {
int basicsal;
	public abstract void calculateSalary();
	public void cal()
	{
		this.basicsal=basicsal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary per hour");
		 basicsal=sc.nextInt();
	}
		
	

}
