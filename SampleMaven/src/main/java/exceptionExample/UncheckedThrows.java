package exceptionExample;



public class UncheckedThrows {
	public static void sum()throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int a=30;
		if (a!=30)
	throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");	
		else
			throw new ArithmeticException("Arithmetic Exception");		
	
	}

	public static void main(String[] args) {
		
		UncheckedThrows.sum();
		
	}

}
