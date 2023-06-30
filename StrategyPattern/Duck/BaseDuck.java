package StrategyPattern.Duck;

import StrategyPattern.Duck.DuckBehaviour.FlyBehaviour.Flyable;
import StrategyPattern.Duck.DuckBehaviour.NoiseBehaviour.Noisable;

public abstract class BaseDuck {
   public Flyable fly;
   public Noisable noise;
   public BaseDuck(Flyable fly,Noisable noise){
        this.fly = fly;
        this.noise = noise;
   }
    public void setFly(Flyable fly) {
        this.fly = fly;
    }
    public void setNoise(Noisable noise) {
        this.noise = noise;
    }
    public void makeSound() {
        noise.sound();
    }
    public void makeFly() {
        fly.fly();
    }
    public abstract  void  display();
}
