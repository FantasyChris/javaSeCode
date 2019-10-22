package designMethod.factoryModel;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Clams createClams() {
        return new ChicagoClams();
    }
}
