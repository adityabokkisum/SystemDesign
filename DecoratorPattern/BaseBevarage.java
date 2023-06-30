package DecoratorPattern;

public abstract class BaseBevarage {
    private Size size;
    public BaseBevarage(Size s) {
        System.out.println("BaseBevarage class invoked");
        size = s;
    }

    public BaseBevarage(){}
    public String description = "Unknown Description";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
    public void setSize(Size S) {
        size = S;
        System.out.println(size + " from BaseBevarage");
    }
    public Size getSize() {
        return size;
    }

}
