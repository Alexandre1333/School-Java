public class Rectangle extends GeometricShape {
    private double height;
    private double width;

    public Rectangle(String outlineColour, double height, double width) {
        super(outlineColour);
        this.height = height;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setOutlineColour(String outlineColour) {
        super.setOutlineColour(outlineColour);
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle - " + super.toString() + ", Height: " + height + ", Width: " + width + ", Area: " + calcArea();
    }

}
