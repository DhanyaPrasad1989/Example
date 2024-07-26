package finalprograms;


public class FinalSample {
	final int a;//uninitialized final variable,it can be initialized in constructor only
	final int b=20;
	public FinalSample()
	{
		a=10;
	}
	public final void display()
	{
	System.out.println(a);	
	//b=25;//cannot change the value of b
	}

	

}
