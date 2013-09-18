package nl.hva.dp2.commands;

import nl.hva.dp2.devices.Oven;

public class OvenIncreaseDegreesCommand implements Command
{
	private Oven oven;
	
	public OvenIncreaseDegreesCommand(Oven oven)
	{
		this.oven = oven;
	}
	
	@Override
	public void execute()
	{
		oven.setDegrees(oven.getDegrees() + 20);
	}
}
