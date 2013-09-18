package nl.hva.dp2.commands;

import nl.hva.dp2.devices.Stereo;

public class StereoDecreaseVolumeCommand implements Command
{
	private Stereo stereo;
	
	public StereoDecreaseVolumeCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}
	
	@Override
	public void execute()
	{
		stereo.setVolume(stereo.getVolume() - 1);
		
		System.out.println("Decreased volume of stereo to: " + stereo.getVolume());
	}
}
