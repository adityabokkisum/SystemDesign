package CommandPattern.ClientDevices.FanDevices;

public class CeilingFan {
    public static final int HIGH =3;
    public static final int MEDIUM =2;
    public static final int LOW =1;
    public static final int OFF =0;
    public String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = LOW;
    }
    public void high() {
        speed = HIGH;
    }
    public void low() {
        speed = LOW;
    }
    public void medium() {
        speed = MEDIUM;
    }
    public void off() {
        speed = OFF;
    }
    public int getSpeed() {
        return speed;
    }
}
