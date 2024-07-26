package interfacepackage;

public class Class1 implements Interface1, Interface2{
	public void display1()
	{
		System.out.println(VALUE);
	}
	public void display2()
	{
		System.out.println(CONST_VALUE);	
	}
public static void main(String args[])
{
	Class1 obj=new Class1();
	obj.display1();
	obj.display2();
}
}
