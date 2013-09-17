package nl.hva.dp2;

import nl.hva.dp2.devices.HotTub;

public class HotTubIncreaseDegreesCommand implements Command
{
	private HotTub hottub;
	
	public HotTubIncreaseDegreesCommand(HotTub hottub)
	{
		this.hottub = hottub;
	}
	
	@Override
	public void execute()
	{
		hottub.setTemperature(hottub.getTemperature() + 1.0);
		
		System.out.println("increased degrees of hottub is now: " + hottub.getTemperature() );
	}
}