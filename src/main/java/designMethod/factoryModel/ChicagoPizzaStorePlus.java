package designMethod.factoryModel;

public class ChicagoPizzaStorePlus extends PizzaStorePlus {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("芝加哥起司披萨");

        }else if (type.equals("clams")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("芝加哥蛤蜊披萨");
        }
        return pizza;
    }
}
