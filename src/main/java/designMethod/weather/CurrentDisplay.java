package weather;

public class CurrentDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private float pres;

    private Subject weatherData;

    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp:"+temp+"humidity:"+humidity+"pres:"+pres);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pres = pressure;
        this.humidity = humidity;
        display();
    }
}
