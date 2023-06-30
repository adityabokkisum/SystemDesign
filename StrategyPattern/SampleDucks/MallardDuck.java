package StrategyPattern.SampleDucks;
import StrategyPattern.Duck.*;
import StrategyPattern.Duck.DuckBehaviour.FlyBehaviour.Flyable;
import StrategyPattern.Duck.DuckBehaviour.NoiseBehaviour.Noisable;
public class MallardDuck extends BaseDuck {
    public MallardDuck(Flyable flyable,Noisable noisable) {
        super(flyable, noisable);
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
