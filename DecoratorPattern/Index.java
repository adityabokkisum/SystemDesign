package DecoratorPattern;

import DecoratorPattern.Bevarages.DarkRoast;
import DecoratorPattern.Decorators.Mocha;
import DecoratorPattern.Decorators.Soy;
import DecoratorPattern.Decorators.Whip;

public class Index {
    public static void main(String[] args) {
        BaseBevarage b = new DarkRoast(Size.VENTI);
        b.setSize(Size.TALL);
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Soy(b);
        b = new Whip(b);
        System.out.println(b.cost());
    }
}
