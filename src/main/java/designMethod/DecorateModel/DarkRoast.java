package designMethod.DecorateModel;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        des = "超优深焙";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
