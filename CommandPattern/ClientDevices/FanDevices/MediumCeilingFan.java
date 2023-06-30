package CommandPattern.ClientDevices.FanDevices;

import CommandPattern.Command;

public class MediumCeilingFan implements Command {
    CeilingFan fan;
    int prevState;
    public MediumCeilingFan(CeilingFan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        prevState = this.fan.getSpeed();
        fan.medium();
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
