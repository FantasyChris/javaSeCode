package weather;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;

    private float temp;

    private float humidity;

    private float pres;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i=0;i<observers.size();i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temp, humidity, pres);
        }
    }

    public void measureChanges() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pres) {
        this.temp = temp;
        this.humidity = humidity;
        this.pres = pres;
        measureChanges();
    }
}
