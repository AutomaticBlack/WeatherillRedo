import java.util.*;

public class Start extends weatherill
{

	Scanner keyboard = new Scanner (System.in);
	public void startGame()
	{
		System.out.println("Hi, enter your name");


		String name = keyboard.nextLine();
		stat guy = new stat(name);
	}





}
