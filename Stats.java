//this class controls the stats of the players character
public class Stats
{
	private String name;
	private int health;
	private int attack;
	private int defend;
	private boolean dead;
	public Stats(String nam)
	{
		health=100;
		attack=100;
		defend=100;
		name=nam;
		dead=false;
	}
	public Stats(int a,int d,int h)
	{
		name="";
		attack=a;
		defend=d;
		health=h;
		dead=false;
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
	public void getAttacked(int value)
	{
		health=health-value;
		if(health<=0)
		{
			dead=true;
			Weatherill die = new Weatherill();
			die.die();
		}
	}
	public void getHealed(int value)
	{
		health=health+value;
	}
	public void levelUp()
	{
		defend=defend+10;
		attack=attack+10;
	}

}