package DecoratorPattern.Decorators;

import DecoratorPattern.BaseBevarage;

public class Mocha extends BaseDecorator{
    public Mocha(BaseBevarage b) {
        this.b = b;
    }
    public String getDescription() {
        return "Mocha " + b.getDescription();
    }
    public double cost() {
        return 23 + b.cost();
    }
}
