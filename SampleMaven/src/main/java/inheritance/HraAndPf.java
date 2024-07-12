package inheritance;

public class HraAndPf extends TotalSalary{
	float hra,pf;
	public void calculate()
	{
		hra=(0.05f*basic);
		pf=(0.20f*basic);
	}

}
