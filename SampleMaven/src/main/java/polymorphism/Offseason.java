package polymorphism;
import java.util.*;
public class Offseason extends Onseason {
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int total=sc.nextInt();
		float dis=(total*0.15f);
		System.out.println("discount at offseason is "+ dis);
	
	}

  public void display()
  {
  
    while(true)
    {
    	  System.out.println("Choose 1 for Onseason");
    	    System.out.println("Choose 2 for Offseason");
    	    Scanner sc = new Scanner(System.in);
    	    System.out.print("Choose the option: ");
    	    int n = sc.nextInt();
	   switch(n)
	   {
	   case 1:
		   super.discount();
		   break;
	   case 2:
		   discount();
		   break;
		   default:
			   System.out.println("Invalid option");
	   }

}
  }
    public static void main(String args[])
    {
    	Offseason obj=new Offseason();
    	obj.display();
}
}