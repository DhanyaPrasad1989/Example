package interfacepackage;

import java.util.Scanner;

public class HDFC implements RBI {
	public void  recurringDeposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		System.out.println("Enter the period of deposit");
		int n=sc.nextInt();
		float total_amount=((amount*r*n)+amount);
		System.out.println("Total amount received after "+n+" years is "+total_amount);
		
	}
	public static void main(String args[])
	{
		HDFC obj=new HDFC();
		obj.recurringDeposit();
	}

}
