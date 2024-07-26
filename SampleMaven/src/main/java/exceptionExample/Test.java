package exceptionExample;

public class Test {
	public static void check(int age) throws ExceptionLicence
	{
		if (age<18)
			throw new ExceptionLicence("Not eligible");
		else
			System.out.println("Eligible for licence");	}

	public static void main(String[] args) {
		try
		{
			check(5);
		}
		catch(ExceptionLicence e)
		{
			System.out.println(e);
		}

	}

}
