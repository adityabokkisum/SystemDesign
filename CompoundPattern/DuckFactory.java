package CompoundPattern;

import CompoundPattern.Behaviour.Quackable;

public interface DuckFactory {
    public Quackable createGoose();
    public Quackable createMallardDuck();
    public Quackable createRedNeckDuck();
}
