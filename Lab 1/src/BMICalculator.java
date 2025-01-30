import java.lang.Math;
// Default Constructor
class BMICalculator {
    private double mass;
    private double height;

    // Getter method for mass
    public double getMass() {
        return mass;
    }
    // Setter method for mass
    public void setMass(double mass) {
        this.mass = mass;
    }
    // Getter method for height
    public double getHeight() {
        return height;
    }
    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }
    // Method to calculate BMI. Dividing mass by height ^2
    public double calculateBmi() {
        return mass / Math.pow(height, 2);
    }
}