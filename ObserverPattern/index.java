package ObserverPattern;

import ObserverPattern.BaseSubject.BaseWeatherObject;
import ObserverPattern.Observers.CurrentWeather;
import ObserverPattern.Observers.WeatherAnalytics;
import ObserverPattern.Observers.WeatherForeCast;

public class index {
    public static void main(String[] args) {
        BaseWeatherObject w = new BaseWeatherObject();
        CurrentWeather cWeather = new CurrentWeather(w);
        WeatherAnalytics wAnalytics = new WeatherAnalytics(w);
        WeatherForeCast wForeCast = new WeatherForeCast(w);
        w.registerEvent(cWeather);
        w.registerEvent(wAnalytics);
        w.registerEvent(wForeCast);
        w.setWeather(43.23, 9, 1);
    }
}
