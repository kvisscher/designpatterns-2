package nl.hva.dp2;

import nl.hva.dp2.devices.CeilingFan;

public class CeilingFanOffCommand implements Command
{
	private CeilingFan ceilingfan;

	public CeilingFanOffCommand(CeilingFan ceilingfan)
	{
		this.ceilingfan = ceilingfan;
	}
	
	@Override
	public void execute()
	{
		ceilingfan.off();
	}
}
