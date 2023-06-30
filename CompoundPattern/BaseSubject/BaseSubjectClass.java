package CompoundPattern.BaseSubject;

import java.util.ArrayList;

public class BaseSubjectClass implements BaseSubject{
    private ArrayList<BaseObserver> observers;

    public BaseSubjectClass() {
        observers = new ArrayList<BaseObserver>();
    }

    @Override
    public void registerEvent(BaseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterEvent(BaseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllEvents() {
        for (BaseObserver observer : observers) {
            observer.update();
        }
    }
}