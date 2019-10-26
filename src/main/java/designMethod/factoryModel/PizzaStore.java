/*
package designMethod.factoryModel;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    //PizzaStore的构造器，参数为工厂
    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        //使用工厂类来创建披萨，取代new具体实例化的方法。
        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();

        pizza.cut();

        pizza.box();

        return pizza;
    }
}
*/
