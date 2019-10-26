package faceObject;

public class Circle {
    private static double PI = 3.14;
    private double r;
    private double s;
    public double getS() {
        s = PI*r*r;
        return s;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.r=2.0;
        double s = circle.getS();
        System.out.println(s);
    }
}
