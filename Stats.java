//this class controls the stats of the players character
public class Stats
{
	private String name;
	private int health;
	private int attack;
	private int defend;
	public Stats(String nam)
	{
		health=100;
		attack=100;
		defend=100;
		name=nam;
	}

	public String getName()
	{
		return name;
	}
	public int getHealth()
	{
		return health;
	}
	public int getAttack()
	{
		return attack;
	}
	public int getDefend()
	{
		return defend;
	}

}