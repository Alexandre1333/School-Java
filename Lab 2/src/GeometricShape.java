public abstract class GeometricShape {
    private String outlineColour;

    public GeometricShape(String outlineColour) {   // Constructor
        this.outlineColour = outlineColour;
    }

    public String getOutlineColour() {
        return outlineColour;
    }

    public void setOutlineColour(String outlineColour) {
        this.outlineColour = outlineColour;
    }
    // Abstract method to calculate area
    public abstract double calcArea();

    @Override
    public String toString() {
        return "Outline Colour: " + outlineColour;
    }
}
