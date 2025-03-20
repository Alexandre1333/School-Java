public class Rectangle extends GeometricShape implements Drawable, Cloneable {
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
        return "Rectangle - " + super.toString() + ", Height: " + height + ", Width: " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return Double.compare(width, other.width) == 0 && Double.compare(height, other.height) == 0 && getOutlineColour().equals(other.getOutlineColour());
    }

    @Override
    public void Draw() {
        System.out.println("i am a rectangle and that's pretty much it");
        final double PI = 3.14;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException{
        try {
            Rectangle cloned = (Rectangle) super.clone();
            cloned.width = this.width;
            cloned.height = this.height;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

