// decorator
class FahrenheitDecorator extends BaseWeatherDecorator {
    private TemperatureConversionStrategy strategy;

    public FahrenheitDecorator(WeatherNotifier weatherNotifier, TemperatureConversionStrategy strategy) {
        super(weatherNotifier);
        this.strategy = strategy;
    }

    @Override
    public void sendNotification(String cityName, int temperatureCelsius, String weatherConditions) {
        int convertedTemperature = strategy.convertTemperature(temperatureCelsius);
        System.out.println("Weather notification sent for " + cityName +
                ": Temperature (Fahrenheit): " + convertedTemperature + ", Conditions: " + weatherConditions);
    }
}