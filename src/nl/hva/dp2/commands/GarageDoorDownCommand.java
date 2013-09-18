package nl.hva.dp2.commands;

import nl.hva.dp2.devices.GarageDoor;

public class GarageDoorDownCommand implements Command
{
	private GarageDoor garagedoor;

	public GarageDoorDownCommand(GarageDoor garagedoor)
	{
		this.garagedoor = garagedoor;
	}
	
	@Override
	public void execute()
	{
		garagedoor.down();
	}
}
