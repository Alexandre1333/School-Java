import java.lang.Math;

public class CircleDemo {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(30);

        System.out.println("Radius " + c.getRadius());
        System.out.println("Area " + c.getArea());
        System.out.println("Circumference " + c.getCircumference());
        System.out.println("Diameter " + c.getDiameter());
    }
    public static class Circle {
        private double radius;

        private void setRadius(double r) {
            radius = r;
        }

        private double getRadius() {
            return radius;
        }

        private double getArea() {
            return Math.pow(radius,2) * Math.PI;
        }
        private double getCircumference() {
            return 2 * Math.PI * radius;
        }
        private double getDiameter() {
            return radius * 2;
        }
    }
}