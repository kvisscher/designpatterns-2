package nl.hva.dp2;

import nl.hva.dp2.commands.Command;

public class RemoteControl
{
	private Command[] commands;

	public RemoteControl()
	{
		this.commands = new Command[9];
	}
	
	public void pushButton(int index)
	{
		commands[index].execute();
	}
	
	public void setCommand(int index, Command command)
	{
		commands[index] = command;
	}
}
