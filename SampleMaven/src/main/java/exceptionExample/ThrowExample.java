package exceptionExample;

public class ThrowExample {
	public static void sum(int a, int b)
	{
		int s=a+b;
		if(s>50)
		throw new ArithmeticException("Sum is greater than 50");
		else
			
			throw new ArrayIndexOutOfBoundsException("Sum is less than 50");
	}

	public static void main(String[] args) {
		try
		{
	
		ThrowExample.sum(50,30);
	}
		catch(ArithmeticException e)
		{
		System.out.println("Exception handled");	
		}
		System.out.println("rest of the code");
	}
}
