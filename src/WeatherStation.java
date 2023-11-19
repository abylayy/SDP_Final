// observer pattern
import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<IWeatherObserver> observers = new ArrayList<>();

    public void addObserver(IWeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IWeatherObserver observer) {
        observers.remove(observer);
    }

    public void updateWeather(String cityName, int temperatureCelsius, String weatherConditions) {
        for (IWeatherObserver observer : observers) {
            observer.update(cityName, temperatureCelsius, weatherConditions);
        }
    }

    public void sendNotifications(String cityName, int temperatureCelsius, String weatherConditions) {
        for (IWeatherObserver observer : observers) {
            observer.update(cityName, temperatureCelsius, weatherConditions);
        }
    }
}
