package nl.hva.dp2.commands;

import nl.hva.dp2.devices.HotTub;

public class HotTubDecreaseDegreesCommand implements Command
{
	private HotTub hottub;
	
	public HotTubDecreaseDegreesCommand(HotTub hottub)
	{
		this.hottub = hottub;
	}
	
	@Override
	public void execute()
	{
		hottub.setTemperature(hottub.getTemperature() - 1.0f);
		
		System.out.println("Decreased degrees of hottub is now: " + hottub.getTemperature() );
	}
}