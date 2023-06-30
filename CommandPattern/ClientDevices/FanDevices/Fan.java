package CommandPattern.ClientDevices.FanDevices;

public class Fan {
    public static int HIGH =3;
    public static int MEDIUM =2;
    public static int LOW =1;
    public static int OFF =0;


    public void on() {
        System.out.println("Fan Got Turned On");
    }
    public void off() {
        System.out.println("Fan Got Turned Off");
    }
}
