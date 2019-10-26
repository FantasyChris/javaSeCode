package designMethod.factoryModel;

public class ClamsPizza extends Pizza {
    PizzaIngredientFactory factory;
    //要制作披萨，需要工厂提供原料。所以每个披萨类都需要从构造器参数得到一个工厂来制造原料。
    public ClamsPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);

        clams = factory.createClams();
    }
}
