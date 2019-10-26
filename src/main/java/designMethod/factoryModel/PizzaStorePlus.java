package designMethod.factoryModel;

public abstract class PizzaStorePlus {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        //createPizza()方法从工厂类中移回PizzaStore
        pizza = createPizza(type);

        pizza.prepare();

        pizza.cut();

        pizza.box();

        return pizza;
    }
    //抽象的
    abstract Pizza createPizza(String type);
}
