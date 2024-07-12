package inheritance;

public class Bike extends Vehicle {
	String s1="Two wheeler";
	int p=50000;
	public void print()
	{
		System.out.println(s1+" Prize: "+p);
	}

	public static void main(String[] args) {
	
		Bike obj=new Bike();
		obj.display();
		obj.print();
		Car obj2=new Car();
		obj2.display2();
				

	}

}
