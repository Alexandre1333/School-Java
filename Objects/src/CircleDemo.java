import java.lang.Math;

public class CircleDemo {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(187);

        System.out.println("Radius " + c.getRadius());
        System.out.println("Area " + c.getArea());
        System.out.println("Circumference " + c.getCircumference());
    }
    public static class Circle {
        private double radius;
        private double area;
        private double Circumference;

        public void setRadius(double r) {
            radius = r;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }
}