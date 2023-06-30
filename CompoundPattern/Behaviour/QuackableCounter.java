package CompoundPattern.Behaviour;

import CompoundPattern.BaseSubject.BaseObserver;
import CompoundPattern.BaseSubject.BaseSubjectClass;

public class QuackableCounter implements Quackable{
    Quackable duck;

    private static int count;
    public QuackableCounter(Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void Quack() {
        duck.Quack();
        System.out.println("Counted");
        count++;
    }
    public static int getCount() {
        return count;
    }

    @Override
    public void registerEvent(BaseObserver observer) {
        duck.registerEvent(observer);
    }

    @Override
    public void unRegisterEvent(BaseObserver observer) {
        duck.unRegisterEvent(observer);
    }

    @Override
    public void notifyAllEvents() {
        duck.notifyAllEvents();
    }
}
