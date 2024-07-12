package inheritance;

public class SalarySlip extends HraAndPf {
	float total;
	public void totalsal()
	{
		total=basic+hra+bonus-pf-deduct;
		System.out.println("Total Salary ="+total);
	}
	

	public static void main(String[] args) {
		SalarySlip obj=new SalarySlip();
		obj.read();
		obj.calculate();
		System.out.println("Basic pay ="+obj.basic);
		System.out.println("Deduction ="+obj.deduct);
		System.out.println("HRA ="+obj.hra);
		System.out.println("PF ="+obj.pf);
		System.out.println("Bonus ="+obj.bonus);
		obj.totalsal();
	}

}
