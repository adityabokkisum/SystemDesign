package CommandPattern.ClientDevices.LightDevices;

import CommandPattern.Command;

public class LightOff implements Command {
    Light light;
    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
    @Override
    public void undo() {
        light.on();
    }
}
