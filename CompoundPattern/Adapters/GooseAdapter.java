package CompoundPattern.Adapters;

import CompoundPattern.BaseSubject.BaseObserver;
import CompoundPattern.BaseSubject.BaseSubjectClass;
import CompoundPattern.Behaviour.Quackable;
import CompoundPattern.Ducks.Goose;

public class GooseAdapter implements Quackable {
    Goose goose;
    BaseSubjectClass subject;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        subject = new BaseSubjectClass();
    }

    @Override
    public void Quack() {
        this.goose.wobble();
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
