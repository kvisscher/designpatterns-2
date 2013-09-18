package nl.hva.dp2.commands;

import nl.hva.dp2.devices.Oven;

public class OvenOnCommand implements Command
{
	private Oven oven;

	public OvenOnCommand(Oven oven)
	{
		this.oven = oven;
	}
	
	@Override
	public void execute()
	{
		oven.on();
	}
}
