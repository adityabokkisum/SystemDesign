package StrategyPattern;

import StrategyPattern.Duck.BaseDuck;
import StrategyPattern.Duck.DuckBehaviour.FlyBehaviour.NoFly;
import StrategyPattern.SampleDucks.MallardDuck;
import StrategyPattern.Duck.DuckBehaviour.FlyBehaviour.*;
import StrategyPattern.Duck.DuckBehaviour.NoiseBehaviour.*;

public class Index {
    public static void main(String[] args) {
        BaseDuck myDuck = new MallardDuck(new FlyWithWings(),new Mute());
        myDuck.makeFly();
        myDuck.makeSound();
        myDuck.setFly(new NoFly());
        myDuck.makeFly();
        myDuck.display();
    }
}
