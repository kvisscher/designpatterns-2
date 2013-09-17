package nl.hva.dp2;

import nl.hva.dp2.devices.CeilingLight;

public class CeilingLightOnCommand implements Command
{
	private CeilingLight ceilinglight;

	public CeilingFanOnCommand(CeilingLight ceilinglight)
	{
		this.ceilinglight = ceilinglight;
	}
	
	@Override
	public void execute()
	{
		ceilingfan.on();
	}
}
