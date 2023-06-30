package DecoratorPattern.Bevarages;

import DecoratorPattern.BaseBevarage;
import DecoratorPattern.Size;

public class DarkRoast extends BaseBevarage {

    public DarkRoast(Size s) {
        super(s);
        description = "DarkRoast";
    }

    public double cost() {
        return 150;
    }
}
