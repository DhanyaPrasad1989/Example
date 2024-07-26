package encapsulation;

public class BankDisplay {

	public static void main(String[] args) {

		Bank obj=new Bank();
		obj.setPin(1212);
		System.out.println(obj.getPin());
		
		
	}

}
