// Singleton Pattern
class WeatherDataSingleton {
    private static WeatherDataSingleton instance;
    private int temperatureCelsius;

    private WeatherDataSingleton() {
    }

    public static synchronized WeatherDataSingleton getInstance() {
        if (instance == null) {
            instance = new WeatherDataSingleton();
        }
        return instance;
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }
}