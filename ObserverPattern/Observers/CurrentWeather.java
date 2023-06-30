package ObserverPattern.Observers;

import ObserverPattern.BaseSubject.BaseWeatherObject;

public class CurrentWeather implements BaseObserver{
    BaseWeatherObject bSubject;
    public CurrentWeather(BaseWeatherObject b) {
        bSubject = b;
    }
    @Override
    public void update() {
       System.out.println("Current Temperature" + ":" + " " + bSubject.getTemperature());
       System.out.println("Current Humidity" + ":" + " " + bSubject.getHumidity());
       System.out.println("Current Pressure" + ":" + " " + bSubject.getPressure());
    }

}
