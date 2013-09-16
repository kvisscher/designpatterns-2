package nl.hva.dp2;

import nl.hva.dp2.devices.OutdoorLight;

public class Main
{
	public static void main(String[] args)
	{
		RemoteControl rc = new RemoteControl();
		
		OutdoorLight outdoorLight = new OutdoorLight();
		
		rc.setCommand(0, new OutdoorLightOnCommand(outdoorLight));
		rc.setCommand(1, new OutdoorLightOffCommand(outdoorLight));
		
		rc.pushButton(0);
		rc.pushButton(1);
	}
}
