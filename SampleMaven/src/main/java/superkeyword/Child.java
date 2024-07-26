package superkeyword;

public class Child extends SuperExample{
	int a=20;
	public Child(int n1,int n2)
	{
		
		super(30,40);//parent class constructor
		int s=n1+n2;
		System.out.println("Child class sum="+s);
		System.out.println("Child class Constructor");
		System.out.println(a);
		System.out.println(super.a);//variable in parent class
	}
	public void display()
	{
		super.display();//parent class method
		System.out.println("Child class method");
	}
	public void print()
	{
		System.out.println("Different method");
	}

	public static void main(String[] args) {
		
Child obj=new Child(20,30);
obj.display();
obj.print();
	}

}
