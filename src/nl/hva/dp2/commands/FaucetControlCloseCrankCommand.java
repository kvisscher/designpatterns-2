package nl.hva.dp2;

import nl.hva.dp2.devices.FaucetControl;

public class FaucetControlCloseCrankCommand implements Command
{
	private FaucetControl faucetcontrol;

	public FaucetControlCloseCrankCommand(FaucetControl faucetcontrol)
	{
		this.faucetcontrol = faucetcontrol;
	}
	
	@Override
	public void execute()
	{
		faucetcontrol.closeCrank();
	}
}
