package designMethod.DecorateModel;

public abstract class Beverage {
    public String des="咖啡";

    public String getDes() {
        return des;
    }

    public abstract double cost();
}
