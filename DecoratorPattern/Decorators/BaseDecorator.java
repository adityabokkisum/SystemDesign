package DecoratorPattern.Decorators;

import DecoratorPattern.BaseBevarage;
import DecoratorPattern.Size;


public abstract class BaseDecorator extends BaseBevarage {

    BaseBevarage b;
    @Override
    public Size getSize(){
        return b.getSize();
    }

}
