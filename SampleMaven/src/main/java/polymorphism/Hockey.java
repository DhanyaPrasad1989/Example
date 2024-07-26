package polymorphism;

public class Hockey extends Game{
	public void play(String game)
	{
		super.play("football");
		super.play("cricket");
		super.play("select");
		System.out.println("game is "+game);

}

	public static void main(String[] args) {
		Game obj=new Hockey();
		obj.play("Hockey");
		
				
	}

}
