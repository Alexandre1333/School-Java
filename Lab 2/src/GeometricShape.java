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

    public boolean equals(Object comparedShape) {
        if (this == comparedShape) {
            return true;
        }
        if (!(comparedShape instanceof GeometricShape)) {
            return false;
        }
        GeometricShape comparedGeometricShape = (GeometricShape) comparedShape;
        if (this.outlineColour.equals(comparedGeometricShape.outlineColour)) {
            return true;
        }
        return false;
    }
}