package nl.hva.dp2;

import nl.hva.dp2.devices.CeilingFan;

public class CeilingFanOnCommand implements Command
{
	private CeilingFan ceilingfan;

	public CeilingFanOnCommand(CeilingFan ceilingfan)
	{
		this.ceilingfan = ceilingfan;
	}
	
	@Override
	public void execute()
	{
		ceilingfan.on();
	}
}
