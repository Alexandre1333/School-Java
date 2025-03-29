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
            while (true) {
                try {
                    System.out.println("Enter Mass");
                    mass = scn.nextDouble();
                    bmiCalc.setWeight(mass);
                    break;
                    // Checks if weight is between 10-300kg. Throws exception warning user when exceeding those limits
                } catch (WeightOutOfRangeException e) {
                    System.out.println(e.getMessage());
                    // Fallback exception if user enters non-numerical value
                } catch (Exception e) {
                    System.out.println("Value must be a number");
                    scn.next();
                }
            }

            while (true) {
                try {
                    System.out.println("Enter Height");
                    height = scn.nextDouble();
                    bmiCalc.setHeight(height);
                    break;
                    // Checks if height is between 0.2-2.2 meters. Throws exception warning user when exceeding those limits
                } catch (HeightOutOfRangeException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Value must be a number");
                    scn.next();
                }
            }
            try {
                // calculates Bmi, shows singaporean bmi risks related to bmi value.
                double bmi = bmiCalc.getBMI();
                String recommendationPhrase = bmiCalc.returnSingaporeanBMIMeaning();
                System.out.println("Based on your bmi of " + bmi + ", you are " + recommendationPhrase);
            } catch (NoBMIException e) {
                System.out.println(e.getMessage());
            }

    }
}