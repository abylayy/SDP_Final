// Base Decorator
public abstract class BaseWeatherDecorator implements WeatherNotifier {
    protected WeatherNotifier weatherNotifier;

    public BaseWeatherDecorator(WeatherNotifier weatherNotifier) {
        this.weatherNotifier = weatherNotifier;
    }

    @Override
    public void sendNotification(String cityName, int temperatureCelsius, String weatherConditions) {
        weatherNotifier.sendNotification(cityName, temperatureCelsius, weatherConditions);
    }
}
