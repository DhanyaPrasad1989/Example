package encapsulation;
import java.util.*;
public class Bank {
	private int pin;
private int amount;
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
		if (pin==1001 || pin == 1234 || pin==1212)
		{
			System.out.println("Valid PIN");
		}
		else
		{
			System.out.println("Invalid PIN");
		}
		
	}
	

}
