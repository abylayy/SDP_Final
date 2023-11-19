// strategy
class CelsiusConversionStrategy implements TemperatureConversionStrategy {
    @Override
    public int convertTemperature(int temperatureCelsius) {
        return temperatureCelsius;
    }
}