package ObserverPattern.Observers;

import ObserverPattern.BaseSubject.BaseWeatherObject;

public class WeatherAnalytics implements BaseObserver{
    BaseWeatherObject bSubject;

    public WeatherAnalytics(BaseWeatherObject w) {
        bSubject = w;

    }

    @Override
    public void update() {
        System.out.println("Avg Temperature" + ":" + " " + bSubject.getTemperature());
       System.out.println("Avg Humidity" + ":" + " " + bSubject.getHumidity());
       System.out.println("Avg Pressure" + ":" + " " + bSubject.getPressure());
    }
    
}
