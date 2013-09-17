package nl.hva.dp2.devices;

public class HotTub
{
    public float degrees;
    
	public void circulate()
	{
		System.out.println("Hot tub is now circulating");
	}
	
	public void jetsOn()
	{
		System.out.println("Hot tun jets are on");
	}
	
	public void jetsOff()
	{
		System.out.println("Hot tub jets are off");
	}
	
	public float getTemperature() {
	    return this.degrees;
	}
	
	public void setTemperature(float degrees)
	{
		this.degrees = degrees;
	}
}
