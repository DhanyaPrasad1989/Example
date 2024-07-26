package interfacepackage;

public class Child implements Sample{
	public void display()
	{
		System.out.println("Abstraction using interface");
		System.out.println(b);
	}
	public void show()
	{
	System.out.println("Method in child");
	System.out.println(VALUE);
	
	}

	public static void main(String[] args) {
	Child obj=new Child();
	obj.display();
	obj.show();

	}

}
