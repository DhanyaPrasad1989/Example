package abstraction;

public class Video extends Google{
	public void search()
	{
		System.out.println("Abstract method in Video class");
	}
	public static void main(String args[])
	{
		Video obj=new Video();
				obj.search();
				Image obj1=new Image();
				obj1.search();
		
	}

}
