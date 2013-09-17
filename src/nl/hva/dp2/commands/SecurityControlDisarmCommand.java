package nl.hva.dp2;

import nl.hva.dp2.devices.SecurityControl;

public class SecurityControlDisarmCommand implements Command
{
	private SecurityControl securitycontrol;

	public SecurityControlDisarmCommand(SecurityControl securitycontrol)
	{
		this.securitycontrol = securitycontrol;
	}
	
	@Override
	public void execute()
	{
		securitycontrol.disarm();
	}
}
