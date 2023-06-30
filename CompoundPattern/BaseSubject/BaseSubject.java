package CompoundPattern.BaseSubject;

import CompoundPattern.Behaviour.Quackable;

public interface BaseSubject {
    public void registerEvent(BaseObserver observer);
    public void unRegisterEvent(BaseObserver observer);
    public void notifyAllEvents();
}
