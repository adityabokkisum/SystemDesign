package CommandPattern.ClientDevices.FanDevices;

import CommandPattern.ClientDevices.LightDevices.Light;
import CommandPattern.Command;

public class FanOn implements Command {
    Fan fan;
    public FanOn(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
    @Override
    public void undo() {
        fan.off();
    }
}
