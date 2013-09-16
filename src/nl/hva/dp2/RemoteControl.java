package nl.hva.dp2;

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
