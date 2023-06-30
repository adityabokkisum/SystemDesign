package StrategyPattern.Duck.DuckBehaviour.FlyBehaviour;

public class NoFly implements Flyable{
    public void fly() {
        System.out.println("I cant fly");
    }
}
