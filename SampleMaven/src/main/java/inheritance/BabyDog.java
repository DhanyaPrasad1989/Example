package inheritance;

public class BabyDog extends Dog{
	int prize=2000;
	public void value()
	{
		System.out.println("Prize = "+prize);
	}

	public static void main(String[] args) {
		
		BabyDog obj=new BabyDog();
				obj.display();
		obj.print();
		obj.value();

	}

}
