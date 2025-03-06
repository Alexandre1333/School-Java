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
        return "Square - " + "Outline Colour: " + getOutlineColour() + ", Height: " + getHeight() + ", Width: " + getWidth();

    }

    @Override
    public void Draw() {
        System.out.println("i am a square and all my sides are equal");
        final double PI = 3.14;
    }

    // makes sure object is both squares, compares height, width and the outline colour
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Square)) return false;
        Square other = (Square) obj;
        return Double.compare(width, other.getWidth()) == 0 && Double.compare(height, other.getHeight()) == 0 && getOutlineColour().equals(other.getOutlineColour());
    }

    @Override
    public Square clone() {
    try {
        Square clone = (Square) super.clone();
        return clone;
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }

    }
}