# Final Project of the Software Design Patterns Course

## Overview

This project serves as the final assignment for the Software Design Patterns course. It is a console application for weather updating administration, showcasing the implementation of several design patterns.

## Design Patterns Used

### Observer Pattern

The Observer pattern is employed to allow various components to receive updates about weather changes. The `WeatherStation` acts as the subject, while classes such as `CelsiusToFahrenheitAdapter` and `FahrenheitDecorator` act as observers.

### Adapter Pattern

The Adapter pattern is utilized in the `CelsiusToFahrenheitAdapter` class to adapt the `WeatherObserver` interface to handle different update parameters.

### Singleton Pattern

The Singleton pattern ensures a single instance of the `WeatherDataSingleton` class, providing a centralized point for storing and accessing weather data.

### Strategy Pattern

The Strategy pattern is implemented through the `TemperatureConversionStrategy` interface, with `CelsiusConversionStrategy` and `FahrenheitConversionStrategy` as concrete strategies. The `WeatherApp` class uses these strategies for temperature conversion.

### Decorator Pattern

The Decorator pattern is employed in the `FahrenheitDecorator` class, allowing dynamic extension of the `BaseWeatherNotifier` class with additional behavior. This pattern enhances the notification system with temperature conversion.

### Factory Pattern

The Factory pattern is used to create instances of the `WeatherNotifier` interface with the help of the `WeatherNotifierFactory` class. This pattern abstracts the creation of `WeatherNotifier` instances, providing flexibility for future extensions.

## Other Classes and Interfaces

### WeatherObserver Interface

The `WeatherObserver` interface defines the contract for objects that need to be notified about weather updates. It has a method `update(String cityName, int temperatureCelsius, String weatherConditions)`.

### WeatherNotifier Interface

The `WeatherNotifier` interface defines the contract for classes responsible for sending weather notifications. It has a method `sendNotification(String cityName, int temperatureCelsius, String weatherConditions)`.

### BaseWeatherNotifier Class

The `BaseWeatherNotifier` class is a concrete implementation of the `WeatherNotifier` interface, providing basic notification functionality.

### CelsiusToFahrenheitAdapter Class

The `CelsiusToFahrenheitAdapter` class adapts the `WeatherObserver` interface to handle different update parameters. It converts Celsius to Fahrenheit and then calls the `update` method.

### FahrenheitConversionStrategy Class

The `FahrenheitConversionStrategy` class is a concrete implementation of the `TemperatureConversionStrategy` interface, providing a strategy for converting temperatures to Fahrenheit.

### WeatherDataSingleton Class

The `WeatherDataSingleton` class ensures a single instance for storing and accessing weather data. It is responsible for holding the current temperature in Celsius.

### WeatherStation Class

The `WeatherStation` class acts as the subject in the Observer pattern. It manages a list of observers (`WeatherObserver` instances) and notifies them about weather updates. It has methods for updating weather and sending notifications.

### CelsiusConversionStrategy Class

The `CelsiusConversionStrategy` class is a concrete implementation of the `TemperatureConversionStrategy` interface, providing a strategy for converting temperatures to Celsius.

### WeatherApp Class

The `WeatherApp` class contains the main method and implements the console application. It handles user input, updates weather, and sends notifications based on user choices.

## Authors

- Amandykov Abylay
- Isenbay Merey
- Yerezhepbayev Azamat

## UML Diagram

![UML Diagram](uml.png)

