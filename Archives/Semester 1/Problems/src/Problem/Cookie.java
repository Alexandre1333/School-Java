package Problem;
import java.util.Scanner;

public class Cookie {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of cookies: ");
        int cookies = input.nextInt();

        int totalCalories = 300 / 4 * cookies;

        System.out.println("The total amount of calories for " + cookies + " cookies"  + " is " + totalCalories + " calories" );
    }
}
