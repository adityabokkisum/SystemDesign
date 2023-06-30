package ObserverPattern.Observers;
import ObserverPattern.BaseSubject.BaseWeatherObject;

public class WeatherForeCast implements BaseObserver{
    BaseWeatherObject bSubject;

    public WeatherForeCast(BaseWeatherObject w) {
        bSubject = w;
    }

    @Override
    public void update() {
        if (bSubject.getTemperature() > 30) {
            System.out.println("Today its sunny");
        } else {
            System.out.println("It's cold here");
        }
    }
}
