package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
	String s=ExcelExample.readStringData(2, 0);
	System.out.println(s);
	String t=ExcelExample.readIntegerData(2,1);
	System.out.println(t);
	}

}
