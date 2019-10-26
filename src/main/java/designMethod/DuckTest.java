package designMethod;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("------------------");
        mallardDuck.setFlyBehavior(new FlyWithRocket());
        mallardDuck.performFly();
        System.out.println("----------------------");
        Duckcall duckcall = new Duckcall();
        duckcall.performQuack();

    }
}
