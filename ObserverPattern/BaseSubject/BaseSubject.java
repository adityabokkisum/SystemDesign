package ObserverPattern.BaseSubject;

import ObserverPattern.Observers.BaseObserver;

public interface BaseSubject {
    public void registerEvent(BaseObserver o);
    public void unRegisterEvent(BaseObserver o);
    public void notifyAllEvents();
}
