package designMethod.SingleModel;

public class Myclass {
    private Myclass(){

    }
    public static Myclass getInstance() {
        return new Myclass();
    }
}
class test {
    public static void main(String[] args) {

        Myclass myclass = Myclass.getInstance();


    }
        }
