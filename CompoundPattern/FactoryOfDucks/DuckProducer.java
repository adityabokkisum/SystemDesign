package CompoundPattern.FactoryOfDucks;

import CompoundPattern.Adapters.GooseAdapter;
import CompoundPattern.Behaviour.Quackable;
import CompoundPattern.Behaviour.QuackableCounter;
import CompoundPattern.DuckFactory;
import CompoundPattern.Ducks.Goose;
import CompoundPattern.Ducks.MallardDuck;
import CompoundPattern.Ducks.RedNeckDuck;

public class DuckProducer implements DuckFactory {
    @Override
    public Quackable createGoose() {
        return new QuackableCounter(new GooseAdapter(new Goose()));
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackableCounter( new MallardDuck());
    }

    @Override
    public Quackable createRedNeckDuck() {
        return new QuackableCounter(new RedNeckDuck());
    }
}
