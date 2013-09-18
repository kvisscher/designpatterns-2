package nl.hva.dp2.devices;

public class Oven
{
	private int degrees;

	public void on()
	{
		System.out.println("Oven is now on");
	}
	
	public void off()
	{
		System.out.println("Oven is now off");
	}
	
	public int getDegrees()
	{
		return degrees;
	}
	
	public void setDegrees(int degrees)
	{
		this.degrees = degrees;
		
		System.out.println("Oven degrees increased to " + degrees);
	}
}
