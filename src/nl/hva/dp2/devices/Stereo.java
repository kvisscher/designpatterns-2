package nl.hva.dp2.devices;

public class Stereo
{
	private int volume;
	private int bass;
	private int trebble;

	public void on()
	{
		System.out.println("Stereo is on");
	}
	
	public void off()
	{
		System.out.println("Stereo is off");
	}
	
	public void turn2Cd()
	{
		System.out.println("turned to CD");
	}
	
	public void turn2Radio()
	{
		System.out.println("turned to radio");
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	
	public int getBass()
	{
		return bass;
	}
	
	public void setBass(int bass)
	{
		this.bass = bass;
	}
	
	public int getTrebble()
	{
		return trebble;
	}
	
	public void setTrebble(int trebble)
	{
		this.trebble = trebble;
	}
}
