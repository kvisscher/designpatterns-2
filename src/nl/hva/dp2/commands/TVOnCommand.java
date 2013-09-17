package nl.hva.dp2;

import nl.hva.dp2.devices.TV;

public class TVOnCommand implements Command
{
	private TV tv;

	public TVOnCommand(TV tv)
	{
		this.tv = tv;
	}
	
	@Override
	public void execute()
	{
		tv.on();
	}
}
