// observer pattern
import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void updateWeather(String cityName, int temperatureCelsius, String weatherConditions) {
        for (WeatherObserver observer : observers) {
            observer.update(cityName, temperatureCelsius, weatherConditions);
        }
    }

    public void sendNotifications(String cityName, int temperatureCelsius, String weatherConditions) {
        for (WeatherObserver observer : observers) {
            observer.update(cityName, temperatureCelsius, weatherConditions);
        }
    }
}
