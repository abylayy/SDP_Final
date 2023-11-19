// observer pattern
interface IWeatherObserver {
    void update(String cityName, int temperatureCelsius, String weatherConditions);
}
