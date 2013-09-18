package nl.hva.dp2;

import nl.hva.dp2.commands.OutdoorLightOffCommand;
import nl.hva.dp2.commands.OutdoorLightOnCommand;
import nl.hva.dp2.commands.TVOffCommand;
import nl.hva.dp2.commands.TVOnCommand;
import nl.hva.dp2.devices.OutdoorLight;
import nl.hva.dp2.devices.TV;

public class Main
{
	public static void main(String[] args)
	{
		RemoteControl rcOutdoorLight = new RemoteControl();
		OutdoorLight outdoorLight = new OutdoorLight();
		
		rcOutdoorLight.setCommand(0, new OutdoorLightOnCommand(outdoorLight));
		rcOutdoorLight.setCommand(1, new OutdoorLightOffCommand(outdoorLight));
		
		rcOutdoorLight.pushButton(0);
		rcOutdoorLight.pushButton(1);
		
		// Remote is being reused for all kinds of devices.
		RemoteControl rcTv = new RemoteControl();
		TV tv = new TV();
		
		rcTv.setCommand(0, new TVOnCommand(tv));
		rcTv.setCommand(1, new TVOffCommand(tv));
		
		rcTv.pushButton(0);
		rcTv.pushButton(1);
	}
}
