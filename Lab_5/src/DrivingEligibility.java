import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Do you have a driving license? (yes/no): ");
        String hasLicense = scanner.nextLine().toLowerCase();

        // Check eligibility: age > 18 and has a driving license
        if (age > 18 && hasLicense.equals("yes")) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("You are not eligible to drive");
        }
    }
}