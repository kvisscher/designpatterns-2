package nl.hva.dp2;

import nl.hva.dp2.devices.Sprinkler;

public class SprinklerOffCommand implements Command
{
	private Sprinkler ceilingfan;

	public SprinklerOffCommand(Sprinkler sprinkler)
	{
		this.sprinkler = sprinkler;
	}
	
	@Override
	public void execute()
	{
		sprinkler.off();
	}
}
