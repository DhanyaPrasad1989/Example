package abstraction;

public class Child extends AbstractExample{
	public void display()
	{
		System.out.println("body of Abstact method ");
	}
public static void main(String args[])
{
	Child obj=new Child();
	obj.display();
	obj.display1();
			
}
}
