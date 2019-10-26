package designMethod.DecorateModel;

public class Mocha extends CondimentDecorator {
    //定义一个实例变量记录被装饰者
    Beverage beverage;
    //使用构造器来记录被装饰者
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDes() {
        return beverage.getDes() + " Mocha";
    }


    @Override
    public double cost() {
        return beverage.cost() + .2;
    }
}
