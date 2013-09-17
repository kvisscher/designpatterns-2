package nl.hva.dp2;

import nl.hva.dp2.devices.FaucetControl;

public class FaucetControlOpenCrankCommand implements Command
{
	private FaucetControl faucetcontrol;

	public FaucetControlOpenCrankCommand(FaucetControl faucetcontrol)
	{
		this.faucetcontrol = faucetcontrol;
	}
	
	@Override
	public void execute()
	{
		faucetcontrol.openCrank();
	}
}
