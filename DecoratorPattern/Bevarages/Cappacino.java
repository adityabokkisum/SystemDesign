package DecoratorPattern.Bevarages;

import DecoratorPattern.BaseBevarage;
import DecoratorPattern.Size;

public class Cappacino extends BaseBevarage {
    public Cappacino(Size s) {
        super(s);
        description = "Cappacino";
    }
    public double cost() {
        return 120;
    }
}
