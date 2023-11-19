// base decorator
public abstract class BaseWeatherDecorator implements IWeatherNotifier {
    protected IWeatherNotifier weatherNotifier;
    public BaseWeatherDecorator(IWeatherNotifier weatherNotifier) {
        this.weatherNotifier = weatherNotifier;
    }
    @Override
    public void sendNotification(String cityName, int temperatureCelsius, String weatherConditions) {
        weatherNotifier.sendNotification(cityName, temperatureCelsius, weatherConditions);
    }
}
