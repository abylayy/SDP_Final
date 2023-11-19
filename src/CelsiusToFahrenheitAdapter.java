// Adapter Pattern
class CelsiusToFahrenheitAdapter implements WeatherObserver {
    private WeatherObserver adaptee;

    public CelsiusToFahrenheitAdapter(WeatherObserver adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void update(String cityName, int temperatureCelsius, String weatherConditions) {
        double temperatureFahrenheit = celsiusToFahrenheit(temperatureCelsius);
        adaptee.update(cityName, (int) temperatureFahrenheit, weatherConditions);
    }

    private double celsiusToFahrenheit(int temperatureCelsius) {
        return (temperatureCelsius * 9.0 / 5.0) + 32;
    }
}
