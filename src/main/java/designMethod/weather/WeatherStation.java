package weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(30, 40, 1000);
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

    }
}
