package designMethod.factoryModel;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory factory;
    //要制作披萨，需要工厂提供原料。所以每个披萨类都需要从构造器参数得到一个工厂来制造原料。
    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);

        cheese = factory.createCheese();
    }
}
