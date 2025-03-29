public class BMICalculator {
    private double height;
    private double weight;

    public BMICalculator() {
        this.height = 0;
        this.weight = 0;
    }

    public void setHeight(double height) throws HeightOutOfRangeException {
        if (height < 0.2 || height > 2.2) {
            throw new HeightOutOfRangeException("Height must be between 0.2 and 2.2 meters.");
        }
        this.height = height;
    }

    public void setWeight(double weight) throws WeightOutOfRangeException {
        if (weight < 10 || weight > 300) {
            throw new WeightOutOfRangeException("Weight must be between 10 and 300 kg.");
        }
        this.weight = weight;
    }

    public String returnSingaporeanBMIMeaning() throws NoBMIException {
        if (height == 0 || weight == 0) {
            throw new NoBMIException("Height or weight not properly set. Cannot calculate BMI.");
        }
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            return "Possible nutritional deficiency and osteoporosis.";
        } else if (bmi > 18.5 && bmi <= 22.9) {
            return "Low risk (healthy range).";
        } else if (bmi >= 23.0 && bmi <= 27.4) {
            return "Moderate risk of developing heart disease, high blood pressure, stroke, diabetes mellitus.";
        } else {
            return "High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic syndrome.";
        }
    }

    public double getBMI() throws NoBMIException {
        if (height == 0 || weight == 0) {
            throw new NoBMIException("Height or weight not properly set. Cannot calculate BMI.");
        }
        return weight / Math.pow(height, 2);
    }
}
