import java.lang.Math;
public class Circle extends GeometricShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void setOutlineColour(String outlineColour) {
        super.setOutlineColour(outlineColour);
    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Area" + calcArea() + "Radius" + radius;
    }



}
