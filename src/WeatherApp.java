import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherDataSingleton weatherData = WeatherDataSingleton.getInstance();
        WeatherStation weatherStation = new WeatherStation();

        // Observer Pattern
        WeatherObserver consoleObserver = (cityName, temperature, weatherConditions) -> {
            System.out.println("Current weather in " + cityName +
                    ": Temperature (Celsius): " + temperature + ", Conditions: " + weatherConditions);
        };

        WeatherObserver notificationObserver = (cityName, temperature, weatherConditions) -> {
            WeatherNotifier weatherNotifier = WeatherNotifierFactory.createWeatherNotifier();
            weatherNotifier.sendNotification(cityName, temperature, weatherConditions);
        };

        WeatherNotifier baseWeatherNotifier = new BaseWeatherNotifier();
        WeatherNotifier fahrenheitDecorator = new FahrenheitDecorator(baseWeatherNotifier, new FahrenheitConversionStrategy());

        weatherStation.addObserver(new CelsiusToFahrenheitAdapter(consoleObserver));
        weatherStation.addObserver(new CelsiusToFahrenheitAdapter(notificationObserver));

        // Menu
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWeather Updating Administration");
            System.out.println("1. Update Weather for Cities");
            System.out.println("2. Send Notification about Weather Updates");
            System.out.println("3. Convert Celsius to Fahrenheit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the city name: ");
                    String cityName = scanner.next();
                    System.out.print("Enter the temperature in Celsius: ");
                    int temperature = scanner.nextInt();
                    System.out.print("Enter weather conditions: ");
                    String weatherConditions = scanner.next();
                    weatherData.setTemperatureCelsius(temperature);
                    System.out.println("Weather updated");
                    break;

                case 2:
                    System.out.print("Enter the city name: ");
                    cityName = scanner.next();
                    System.out.print("Enter the temperature in Celsius: ");
                    temperature = scanner.nextInt();
                    System.out.print("Enter weather conditions: ");
                    weatherConditions = scanner.next();

                    // Use FahrenheitDecorator to ensure Fahrenheit conversion
                    WeatherNotifier weatherNotifier = new FahrenheitDecorator(baseWeatherNotifier, new FahrenheitConversionStrategy());
                    weatherNotifier.sendNotification(cityName, temperature, weatherConditions);
                    break;


                case 3:
                    System.out.print("Enter the temperature in Celsius: ");
                    int celsiusTemperature = scanner.nextInt();
                    TemperatureConversionStrategy conversionStrategy = new FahrenheitConversionStrategy();
                    int convertedTemperature = conversionStrategy.convertTemperature(celsiusTemperature);
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                    break;

                case 4:
                    System.out.println("Exiting Weather App. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}