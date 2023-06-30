package CompoundPattern;

import CompoundPattern.BaseSubject.Observer;
import CompoundPattern.Behaviour.Quackable;
import CompoundPattern.Behaviour.QuackableCounter;
import CompoundPattern.FactoryOfDucks.DuckProducer;

public class Index {
    public static void main(String[] args) {
        Index index = new Index();
        index.simulate();
    }
    public void simulate() {
        DuckFactory duckProducer = new DuckProducer();
        Observer observer = new Observer();
        Quackable mallardDuck = duckProducer.createMallardDuck();
        Quackable redNeckDuck = duckProducer.createRedNeckDuck();
        Quackable goose = duckProducer.createGoose();

        mallardDuck.registerEvent(observer);
        redNeckDuck.registerEvent(observer);
        simulate(mallardDuck);
        simulate(redNeckDuck);
        simulate(goose);
        System.out.println(QuackableCounter.getCount());
    }
    public void simulate(Quackable duck) {
        duck.Quack();
    }
}
