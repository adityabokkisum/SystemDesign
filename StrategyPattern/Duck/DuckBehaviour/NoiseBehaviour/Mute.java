package StrategyPattern.Duck.DuckBehaviour.NoiseBehaviour;

public class Mute implements Noisable{
    public void sound() {
        System.out.println("I am Mute");
    }
}
