// Factory Pattern
class WeatherNotifierFactory {
    public static WeatherNotifier createWeatherNotifier() {
        WeatherNotifier baseWeatherNotifier = new BaseWeatherNotifier();
        TemperatureConversionStrategy conversionStrategy = new CelsiusConversionStrategy();
        return new FahrenheitDecorator(baseWeatherNotifier, conversionStrategy);
    }
}
