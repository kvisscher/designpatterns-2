package nl.hva.dp2.commands;

import nl.hva.dp2.devices.SecurityControl;

public class SecurityControlArmCommand implements Command
{
	private SecurityControl securitycontrol;

	public SecurityControlArmCommand(SecurityControl securitycontrol)
	{
		this.securitycontrol = securitycontrol;
	}
	
	@Override
	public void execute()
	{
		securitycontrol.arm();
	}
}
