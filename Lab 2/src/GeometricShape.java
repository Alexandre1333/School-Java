import java.util.Date;
public abstract class GeometricShape implements Drawable, Cloneable {
    private String outlineColour;
    private Date creationDate;

    public GeometricShape(String outlineColour) {   // Constructor
        this.outlineColour = outlineColour;
        this.creationDate = new Date();
    }

    public Date getCreationDate() {
        return (Date) creationDate.clone();
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = (Date) creationDate.clone();
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
        return "Outline Colour: " + outlineColour + ", Creation Date: " + creationDate;
    }

    @Override
    public GeometricShape clone() throws CloneNotSupportedException {
        try {
            GeometricShape cloned = (GeometricShape) super.clone();
            cloned.creationDate = new Date(); //
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

