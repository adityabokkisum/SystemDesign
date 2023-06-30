package CommandPattern.ClientDevices.FanDevices;

import CommandPattern.Command;

public class HighCeilingFan implements Command {
    CeilingFan fan;
    int prevState;
    public HighCeilingFan(CeilingFan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        prevState = this.fan.getSpeed();
        fan.high();
    }
    @Override
    public void undo() {
        switch(prevState) {
            case 3:
                this.fan.high();
                break;
            case 2:
                this.fan.medium();
                // code block
                break;
            case 1:
                this.fan.low();
                // code block
                break;
            default:
                this.fan.off();
        }
    }
}
