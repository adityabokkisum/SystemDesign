package ObserverPattern.BaseSubject;

import java.util.ArrayList;

import ObserverPattern.Observers.BaseObserver;

public class BaseWeatherObject implements BaseSubject{

    private double temperature;
    private double humidity;
    private double pressure;
    private ArrayList<BaseObserver> observers;
    public BaseWeatherObject() {
        observers = new ArrayList<BaseObserver>();
    }
    @Override
    public void registerEvent(BaseObserver o) {
      observers.add(o);
    }

    @Override
    public void unRegisterEvent(BaseObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllEvents() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }
    public void setWeather(double temperature, double humidity,double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllEvents();
    }
    public double getTemperature() {
       return temperature;
    }
    public double getHumidity() {
       return humidity;
    }
    public double getPressure() {
        return pressure;
    }
}
