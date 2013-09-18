package nl.hva.dp2.commands;

import nl.hva.dp2.devices.CeilingLight;

public class CeilingLightOnCommand implements Command
{
	private CeilingLight ceilinglight;

	public CeilingLightOnCommand(CeilingLight ceilinglight)
	{
		this.ceilinglight = ceilinglight;
	}
	
	@Override
	public void execute()
	{
		ceilinglight.on();
	}
}
