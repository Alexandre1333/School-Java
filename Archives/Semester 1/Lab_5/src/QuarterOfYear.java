import java.util.Scanner;

public class QuarterOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();

        if (month == 1 || month == 2 || month == 3) {
            System.out.println("The month is in the first quarter.");
        } else if (month >= 4 && month <= 6) {
            System.out.println("The month is in the second quarter.");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("The month is in the third quarter.");
        } else if (month >= 10 && month <= 12) {
            System.out.println("The month is in the fourth quarter.");
        } else {
            System.out.println("Error: Invalid month. Please enter a number between 1 and 12.");
        }
    }
}