package inheritance;
import java.util.*;
public class TotalSalary {
	int basic,deduct,bonus;
	public void read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the basic salary");
	basic=sc.nextInt();
	System.out.println("Enter the Deduction");
	deduct=sc.nextInt();
	System.out.println("Enter the bonus");
	bonus=sc.nextInt();
}
}

