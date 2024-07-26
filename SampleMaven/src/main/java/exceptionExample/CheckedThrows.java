package exceptionExample;
import java.io.IOException;
public class CheckedThrows {
	public static void sum()throws IOException
	{
		
	throw new IOException("IOchecked Exception");	
	}


	public static void main(String[] args)throws IOException
	{
	sum();

	}

}
