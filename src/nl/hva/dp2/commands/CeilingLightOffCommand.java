package nl.hva.dp2;

import nl.hva.dp2.devices.CeilingLight;

public class CeilingLightOffCommand implements Command
{
	private CeilingLight ceilinglight;

	public CeilingLightOffCommand(CeilingLight ceilinglight)
	{
		this.ceilinglight = ceilinglight;
	}
	
	@Override
	public void execute()
	{
		ceilinglight.off();
	}
}
