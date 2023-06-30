package CommandPattern.BaseInvokers;

import CommandPattern.Command;
import CommandPattern.NoCommand;

public class RemoteControl {
    Command[] commandOn;
    Command[] commandOff;
    Command undoCommand;
    public RemoteControl() {
        commandOn = new Command[7];
        commandOff = new Command[7];
        for(int i=0; i<7;i++) {
            commandOn[i]=new NoCommand();
            commandOff[i]=new NoCommand();
        }
    }
    public void setCommand(int slot,Command commandOn,Command commandOff) {
        this.commandOn[slot] = commandOn;
        this.commandOff[slot] = commandOff;
    }
    public void onButtonPushed(int slot) {
        commandOn[slot].execute();
        undoCommand = commandOn[slot];
    }
    public void offButtonPushed(int slot) {
        commandOff[slot].execute();
        undoCommand = commandOff[slot];
    }
    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
