package CompoundPattern.Ducks;

import CompoundPattern.BaseSubject.BaseObserver;
import CompoundPattern.BaseSubject.BaseSubjectClass;
import CompoundPattern.Behaviour.Quackable;

public class MallardDuck implements Quackable {
    BaseSubjectClass subject;
    public MallardDuck() {
        subject = new BaseSubjectClass();
    }
    @Override
    public void Quack() {
        System.out.println("Quacking");
        notifyAllEvents();
    }

    @Override
    public void registerEvent(BaseObserver observer) {
        subject.registerEvent(observer);
    }

    @Override
    public void unRegisterEvent(BaseObserver observer) {
        subject.unRegisterEvent(observer);
    }

    @Override
    public void notifyAllEvents() {
        subject.notifyAllEvents();
    }
}
