// Observer Pattern
interface IWeatherObserver {
    void update(String cityName, int temperatureCelsius, String weatherConditions);
}
