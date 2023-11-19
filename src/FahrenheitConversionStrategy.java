// strategy
class FahrenheitConversionStrategy implements ITemperatureConversionStrategy {
    @Override
    public int convertTemperature(int temperatureCelsius) {
        return (int) ((temperatureCelsius * 9.0 / 5.0) + 32);
    }
}