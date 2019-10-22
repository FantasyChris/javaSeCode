package designMethod;

public class Duckcall {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duckcall() {
        quackBehavior = new QuackByDuckCall();
    }
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
