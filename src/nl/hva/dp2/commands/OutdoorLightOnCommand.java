package nl.hva.dp2;

import nl.hva.dp2.devices.OutdoorLight;

public class OutdoorLightOnCommand implements Command
{
	private OutdoorLight outdoorLight;

	public OutdoorLightOnCommand(OutdoorLight outdoorLight)
	{
		this.outdoorLight = outdoorLight;
	}
	
	@Override
	public void execute()
	{
		outdoorLight.on();
	}
}
