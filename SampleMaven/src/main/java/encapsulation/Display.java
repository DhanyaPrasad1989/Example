package encapsulation;

public class Display {

	public static void main(String[] args) {
	BankAccount obj=new BankAccount();
	obj.setAccno(122324343);
	obj.setEmail("dhdgh@gmail.com");
	obj.setBal(5000);
	System.out.println("Account No: "+obj.getAccno());
	System.out.println("Email ID: "+ obj.getEmail());
	System.out.println("Balance" +obj.getBal());

	}

}
