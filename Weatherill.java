/*
Michael Huang and Daniy Lomeo
AP CS
6.2.15
This is the main class of the Text Based Game Weatherill
*/

import java.util.*;

public class Weatherill
{
	public static void main (String[]args)
	{
		Scanner keyboard= new Scanner (System.in);
		Start one = new Start();
		one.startGame();
	}
	public void die()
	{
		System.out.println("You have died please try again!");
	}
}
