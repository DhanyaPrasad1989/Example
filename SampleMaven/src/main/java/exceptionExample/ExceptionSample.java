package exceptionExample;

public class ExceptionSample {

	public static void main(String[] args) {
	int a=5;
	int d[]=new int[5];
	int b=10;
	int c=a+b;
	
	try
	{
		d[6]=1;
	int s=c/0;

	}
	/*catch(ArithmeticException  e)
	{
		System.out.println("Exception handled");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array size Exception");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}*/
	finally
	{
System.out.println("finally block will always executed");

	}
	System.out.println("rest of the code");

}
}

