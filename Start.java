import java.util.*;

public class Start
{
	public Start()
	{
	}

	Scanner keyboard = new Scanner (System.in);
	public void startGame()
	{
		//THIS IS THE INTRO STUFF
		System.out.println("HELLO, WELCOME TO THE WORLD OF WEATHERILL");
		System.out.println("Oh, you don't look too well, let me introduce myself!");
		System.out.println("I am Jakobe, and I was walking to the discotech...");
		System.out.println(" and I found you passed out in the ditch in the road...");
		System.out.println("Anyways, you had about 4 dildos stuck up your ass, but... ");
		System.out.println("Hey! Don't look at me like that! They weren't even b-");
		System.out.println("Ahem- Excuse me, what's your name");
		System.out.print("(Type in your name here)  :");
		String name = keyboard.nextLine();
		Stats guy = new Stats(name);
		System.out.println("Ah, so your name is "+name+"...?");

		//THIS IS A TEST BATTLE
		System.out.println("LETS BATTLE");
	}





}
