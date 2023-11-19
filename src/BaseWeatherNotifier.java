// decorator
class BaseWeatherNotifier implements WeatherNotifier {
    @Override
    public void sendNotification(String cityName, int temperatureCelsius, String weatherConditions) {
        System.out.println("Weather notification sent for " + cityName +
                ": Temperature (Celsius): " + temperatureCelsius + ", Conditions: " + weatherConditions);
    }
}
