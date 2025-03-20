// Import Scanner library for user input
import java.util.Scanner;
public class BMICalculatorDemo {
    public static void main(String[] args) {
        // Create an instance of BmiCalculator class with values set to 0
        BMICalculator bmiCalc = new BMICalculator();
        // Create scanner object for user input
        Scanner scn = new Scanner(System.in);
        // Variables to store mass and height inputs
        double mass;
        double height;
        try {
            // Prompt user to input mass
            System.out.println("Enter Mass");
            mass = scn.nextDouble();
            // Validate that mass is within range (10 to 300)
            if (mass >= 10 && mass <= 300) {
                bmiCalc.setMass(mass);
            } else {
                System.out.println("Values below 10 and above 300 are not valid!");
            }
            // Prompt user to input height
            System.out.println("Enter Height");
            height = scn.nextDouble();
            // Validate height is within range (0.2 and 2.2)
            if (height >= 0.2 && height <= 2.2) {
                bmiCalc.setHeight(height);
            } else {
                System.out.println("Values below 0.2 and above 2.2 are not valid!");
            }
            // Calculate BMI using BmiCalculator instance
            double bmi = bmiCalc.calculateBmi();
            // Determine BMI category based on calculated BMI value
            String recommendationPhrase;
            if (bmi <= 18.5) {
                recommendationPhrase = "Possible nutritional deficiency and osteoporosis.";
            } else if (bmi > 18.5 && bmi <= 22.9) {
                recommendationPhrase = "Low risk (healthy range).";
            } else if (bmi >= 23.0 && bmi <= 27.4) {
                recommendationPhrase = "Moderate risk of developing heart disease, high blood pressure, stroke, diabetes mellitus.";
            } else {
                recommendationPhrase = "High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic syndrome.";
            }
            // Output BMI value and its corresponding category
            System.out.println("Based on your bmi of " + bmi + ", you are " + recommendationPhrase);

        } catch(Exception e) {
            // Handle non-numerical values
            System.out.println("Value must be a number");
        }
    }
}
