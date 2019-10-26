package designMethod.DecorateModel;

public class StartTest {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Soy soy = new Soy(darkRoast);
        Mocha mocha = new Mocha(soy);
        System.out.println(mocha.getDes());
        System.out.println(mocha.cost());
    }
}
