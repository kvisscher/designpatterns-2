package nl.hva.dp2.commands;

import nl.hva.dp2.devices.GarageDoor;

public class GarageDoorUpCommand implements Command
{
	private GarageDoor garagedoor;

	public GarageDoorUpCommand(GarageDoor garagedoor)
	{
		this.garagedoor = garagedoor;
	}
	
	@Override
	public void execute()
	{
		garagedoor.up();
	}
}
