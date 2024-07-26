package encapsulation;

public class Sample {

	public static void main(String[] args) {
		Employee obj=new Employee();//local aggregation
		obj.setter("Anu","Engineer",5000);
		obj.getter();

	}

}
