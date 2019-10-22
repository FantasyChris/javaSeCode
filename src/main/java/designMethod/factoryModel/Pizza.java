package designMethod.factoryModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;

    Cheese cheese;

    Clams clams;
    //佐料
    List toppings = new ArrayList();

    abstract void prepare();

    void cut() {
        System.out.println("切披萨");
    }

    void box() {
        System.out.println("装披萨");
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PizzaPlus{" +
                "name='" + name + '\'' +
                ", cheese=" + cheese +
                ", clams=" + clams +
                ", toppings=" + toppings +
                '}';
    }
}
