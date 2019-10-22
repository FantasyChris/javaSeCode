package faceObject.TestCylinder;

public class Cylinder extends Circle {
    private double length;
    public Cylinder() {
        this.length = 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return findArea()*length;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.findVolume());

    }
}
