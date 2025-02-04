public class GeometricShape {
    private String outlineColour;
    private double area;

    public String getOutlineColour() {
        return outlineColour;
    }

    public void setOutlineColour(String outlineColour) {
        this.outlineColour = outlineColour;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calcArea() {
        return this.area;
    }

}
