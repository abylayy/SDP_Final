// Factory Pattern
class WeatherNotifierFactory {
    public static IWeatherNotifier createWeatherNotifier() {
        IWeatherNotifier baseWeatherNotifier = new BaseWeatherNotifier();
        ITemperatureConversionStrategy conversionStrategy = new CelsiusConversionStrategy();
        return new FahrenheitDecorator(baseWeatherNotifier, conversionStrategy);
    }
}
