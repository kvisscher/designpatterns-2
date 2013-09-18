package nl.hva.dp2.commands;

import nl.hva.dp2.devices.Stereo;

public class StereoIncreaseVolumeCommand implements Command
{
	private Stereo stereo;
	
	public StereoIncreaseVolumeCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}
	
	@Override
	public void execute()
	{
		stereo.setVolume(stereo.getVolume() + 1);
		
		System.out.println("increased volume of stereo to: " + stereo.getVolume());
	}
}
