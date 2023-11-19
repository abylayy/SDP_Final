// strategy
class CelsiusConversionStrategy implements ITemperatureConversionStrategy {
    @Override
    public int convertTemperature(int temperatureCelsius) {
        return temperatureCelsius;
    }
}