package DecoratorPattern.Decorators;

import DecoratorPattern.BaseBevarage;
import DecoratorPattern.Size;

public class Soy extends  BaseDecorator{
    public Soy(BaseBevarage b) {
        this.b = b;
    }
    public String getDescription() {
        return "Soy " + b.getDescription();
    }
    public double cost() {
        double soyCost = 23;
        System.out.println(b.getSize() + " " + "From Soy");
        if (b.getSize() == Size.VENTI) {
            soyCost += 5;
        } else if (b.getSize() == Size.TALL) {
            soyCost += 10;
        } else if (b.getSize() == Size.GRANDE) {
            soyCost += 15;
        }
        System.out.println(soyCost);
        return soyCost + this.b.cost();
    }
}
