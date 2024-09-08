import java.util.Scanner;
public class Mpg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the miles driven: ");
        double milesDriven = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the gallons of fuel used: ");
        double gallonsUsed = input2.nextDouble();

        double milesPerGallon = (milesDriven / gallonsUsed);

        System.out.printf("The miles-per-gallon is %,.0f\n", milesPerGallon);
        System.out.printf("The miles-per-gallon is %,.2f", milesPerGallon);

    }
}
