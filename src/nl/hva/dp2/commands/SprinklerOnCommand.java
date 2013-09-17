package nl.hva.dp2;

import nl.hva.dp2.devices.Sprinkler;

public class SprinklerOnCommand implements Command
{
	private Sprinkler ceilingfan;

	public SprinklerOnCommand(Sprinkler sprinkler)
	{
		this.sprinkler = sprinkler;
	}
	
	@Override
	public void execute()
	{
		sprinkler.on();
	}
}
