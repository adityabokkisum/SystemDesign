package DecoratorPattern.Decorators;

import DecoratorPattern.BaseBevarage;

public class Whip extends BaseDecorator{
    public Whip(BaseBevarage b) {
        this.b = b;
    }
    public String getDescription() {
        return "Whip " + b.getDescription();
    }
    public double cost() {
        return 23 + b.cost();
    }
}
