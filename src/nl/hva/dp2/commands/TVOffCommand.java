package nl.hva.dp2;

import nl.hva.dp2.devices.TV;

public class TVOffCommand implements Command
{
	private TV tv;

	public TVOffCommand(TV tv)
	{
		this.tv = tv;
	}
	
	@Override
	public void execute()
	{
		tv.off();
	}
}
