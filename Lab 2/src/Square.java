public class Square extends Rectangle {
    private double width;
    private double height;

    public Square(String outlineColour, double height, double width) {
        super(outlineColour, height, width);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
    }

    @Override
    public String toString() {
        return "Square - " + "Outline Colour: " + getOutlineColour() + ", Height: " + getHeight() + ", Width: " + getWidth() + ", Area : " + super.calcArea();

    }
}
