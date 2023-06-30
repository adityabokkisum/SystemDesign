package CommandPattern;

import CommandPattern.BaseInvokers.RemoteControl;
import CommandPattern.ClientDevices.FanDevices.*;
import CommandPattern.ClientDevices.LightDevices.Light;
import CommandPattern.ClientDevices.LightDevices.LightOn;
import CommandPattern.ClientDevices.LightDevices.LightOff;
public class Index {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light l = new Light();
        LightOn l1 = new LightOn(l);
        LightOff l2 = new LightOff(l);
        Fan f = new Fan();
        FanOff f1 = new FanOff(f);
        FanOn f2 = new FanOn(f);
        remoteControl.setCommand(0,l1,l2);
        remoteControl.setCommand(1,f1,f2);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.undoButtonPushed();
        CeilingFan ceilingFan = new CeilingFan("Hall");
        HighCeilingFan highCeilingFan = new HighCeilingFan(ceilingFan);
        LowCeilingFan lowCeilingFan = new LowCeilingFan(ceilingFan);
        MediumCeilingFan mediumCeilingFan = new MediumCeilingFan(ceilingFan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceilingFan);
        remoteControl.setCommand(2,highCeilingFan,ceilingFanOff);
        remoteControl.setCommand(3,lowCeilingFan,ceilingFanOff);
        remoteControl.setCommand(4,mediumCeilingFan,ceilingFanOff);
        remoteControl.onButtonPushed(2);
        System.out.println(ceilingFan.getSpeed());
        remoteControl.onButtonPushed(3);
        System.out.println(ceilingFan.getSpeed());
        remoteControl.undoButtonPushed();
        System.out.println(ceilingFan.getSpeed());
    }
}
