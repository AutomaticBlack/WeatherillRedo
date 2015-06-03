import java.util.*;

public class Start
{

	Scanner keyboard = new Scanner (System.in);
	public void startGame()
	{
		System.out.println("Hi, enter your name");


		String name = keyboard.nextLine();
		Stats guy = new Stats(name);
	}





}
