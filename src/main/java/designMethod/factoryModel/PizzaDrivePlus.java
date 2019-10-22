package designMethod.factoryModel;

public class PizzaDrivePlus {
    public static void main(String[] args) {
        NYPizzaStorePlus nyPizzaStorePlus = new NYPizzaStorePlus();
        ChicagoPizzaStorePlus chicagoPizzaStorePlus = new ChicagoPizzaStorePlus();
        Pizza pizza = nyPizzaStorePlus.orderPizza("cheese");
        System.out.println("订了个："+pizza.getName());
        pizza = chicagoPizzaStorePlus.orderPizza("cheese");
        System.out.println("订了个："+pizza.getName());
    }
}
