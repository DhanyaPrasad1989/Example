package aggregation;

public class Student {
	String name;
	int roll;
	Address addr;
	public Student(String name,int roll,Address addr)
	{
		this.name=name;
		this.roll=roll;
		this.addr=addr;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll number : "+roll);
		System.out.println("House name : "+addr.housename);
		System.out.println("House No: : "+addr.houseno);
		System.out.println("City : "+addr.city);
		System.out.println("PIN : "+addr.pin);
	
	}

	public static void main(String[] args) {
	Address obj=new Address("Bhavan","Tvm",36,675552);
	Student obj1=new Student("Anu",22,obj);
	obj1.display();

	}

}
