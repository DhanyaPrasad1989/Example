package superkeyword;

public class CheckSum extends Addition {
	public void sum()
	{
		int a=super.sum(1,20);
		//int s1=super.s;
	if (a%10==0)
		System.out.println("Number is divisible by 10");
	else
		System.out.println("Number is not divisible by 10");	
	}

	public static void main(String[] args) {
		CheckSum obj=new CheckSum();
		obj.sum();

	}

}
