package polymorphism;

public class Child extends Parent
{
	
public void display(int a,int b)
{
	super.display(3,6);
	int s=a+b;
	System.out.println("Child class sum is "+s);
}
	public static void main(String[] args) {
		Parent obj=new Child();//obcasting
		obj.display(3,2);
		

	}

}
