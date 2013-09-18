package nl.hva.dp2.commands;

import nl.hva.dp2.devices.OutdoorLight;

public class OutdoorLightOffCommand implements Command
{
	private OutdoorLight outdoorLight;

	public OutdoorLightOffCommand(OutdoorLight outdoorLight)
	{
		this.outdoorLight = outdoorLight;
	}
	
	@Override
	public void execute()
	{
		outdoorLight.off();
	}

}
