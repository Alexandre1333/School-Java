import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive non-zero integer: ");
            number = scn.nextInt();

        } while (number <= 0);

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum of one to " + number + " is " +sum);
    }
}