package inheritance;

public class Developer extends Employee{
	int sal=5000;
	public void display()
	{
		System.out.println("Salary is "+sal);
	}

	public static void main(String[] args) {
		Developer obj=new Developer();
		obj.display();
			obj.print();
	}

}
